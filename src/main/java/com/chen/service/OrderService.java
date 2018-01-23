package com.chen.service;

import java.util.List;

import com.chen.model.Car;
import com.chen.model.Order;
import com.chen.model.OrderList;
import com.chen.model.Ticket;
import com.chen.model.User;

public interface OrderService {

	List<Ticket> getAllTicket(String datetime);

	List<Order> getOrderByUid(Integer uid);

	List<OrderList> getOrderListByOid(Integer oid);

	void userPay(User user);

	List<Ticket> getMyCar(Integer uid);

	void addCar(Car car);

	void updateTnum(Car car);

	void deleteCar(Car car);

	boolean buyClose(Integer uid);

}
