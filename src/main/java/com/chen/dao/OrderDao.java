package com.chen.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.chen.model.Car;
import com.chen.model.Order;
import com.chen.model.OrderList;
import com.chen.model.Ticket;
import com.chen.model.User;

@Mapper
public interface OrderDao {

	List<Ticket> getAllTicket(@Param("datetime")String datetime);

	List<Order> getOrderByUid(Integer uid);

	List<OrderList> getOrderListByOid(Integer oid);

	void userPay(User user);

	List<Ticket> getMyCar(Integer uid);

	void addCar(Car car);

	Car getCarByTidAndUid(Car car);

	void updateCar(Car car);

	void deleteCar(Car car);

	void addOrder(Order order);

	void addOrderList(OrderList orderList);

	void deleteMyCar(Integer uid);

	void minusMyBalance(@Param("uid")Integer uid, @Param("totalprice")double totalprice);

	double checkMyBalance(Integer uid);

}
