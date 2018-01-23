package com.chen.service.impl;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chen.dao.OrderDao;
import com.chen.model.Car;
import com.chen.model.Order;
import com.chen.model.OrderList;
import com.chen.model.Ticket;
import com.chen.model.User;
import com.chen.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderDao orderDao;

	@Override
	public List<Ticket> getAllTicket(String datetime) {
		return orderDao.getAllTicket(datetime);
	}

	@Override
	public List<Order> getOrderByUid(Integer uid) {
		return orderDao.getOrderByUid(uid);
	}

	@Override
	public List<OrderList> getOrderListByOid(Integer oid) {
		return orderDao.getOrderListByOid(oid);
	}

	@Override
	public void userPay(User user) {
		orderDao.userPay(user);
		
	}

	@Override
	public List<Ticket> getMyCar(Integer uid) {
		return orderDao.getMyCar(uid);
	}

	@Override
	@Transactional
	public void addCar(Car car) {
		Car car1 = orderDao.getCarByTidAndUid(car);
		if(null==car1){
			orderDao.addCar(car);
		}else{
			car.setTnum(car.getTnum()+car1.getTnum());
			orderDao.updateCar(car);
		}
		
	}

	@Override
	public void updateTnum(Car car) {
		orderDao.updateCar(car);
		
	}

	@Override
	public void deleteCar(Car car) {
		orderDao.deleteCar(car);
		
	}

	@Override
	@Transactional
	public boolean buyClose(Integer uid) {
		List<Ticket> tickets = orderDao.getMyCar(uid);
		double totalprice = 0;
		for (Ticket ticket : tickets) {
			totalprice += ticket.getPrice()*ticket.getTnum();
		}
		double myBalance = orderDao.checkMyBalance(uid);
		if(myBalance>=totalprice){
			Format format = new SimpleDateFormat("yyyyMMddHHmmss");
			String time = format.format(new Date());
			String oid = time + uid;
			Order order = new Order(null, uid, oid, time, totalprice);
			orderDao.addOrder(order);
			for (Ticket ticket : tickets) {
				OrderList orderList = new OrderList(null, oid, ticket.getTname(), ticket.getPrice()*ticket.getTnum(), ticket.getPrice(), ticket.getTnum());
				orderDao.addOrderList(orderList);
			}
			orderDao.deleteMyCar(uid);
			orderDao.minusMyBalance(uid,totalprice);
			return true;
		}else{
			return false;
		}
		
	}

}
