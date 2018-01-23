package com.chen.controller;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chen.model.Car;
import com.chen.model.Order;
import com.chen.model.OrderList;
import com.chen.model.Ticket;
import com.chen.model.User;
import com.chen.service.OrderService;
import com.chen.service.UserService;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("main")
	public String main(){
		return "order/main";
	}
	
	@RequestMapping("top")
	public String top(){
		return "order/top";
	}
	
	@ResponseBody
	@RequestMapping("getOrderByUid")
	public List<Order> getOrderByUid(HttpServletRequest request){
		User user = (User) request.getSession().getAttribute("user");
		List<Order> orders = orderService.getOrderByUid(user.getUid());
		return orders;
	}
	
	@ResponseBody
	@RequestMapping("getOrderListByOid")
	public List<OrderList> getOrderListByOid(Integer oid){
		List<OrderList> orders = orderService.getOrderListByOid(oid);
		return orders;
	}
	
	@RequestMapping("myOrder")
	public String myOrder(HttpServletRequest request){
		User user = (User) request.getSession().getAttribute("user");
		if(user==null){
			request.setAttribute("error", "您还没有登录!");
			return "user/login";
		}else{
			
			return "order/myOrder";
		}
	}
	
	@RequestMapping("getAllTicket")
	public String getAllTicket(String datetime,HttpServletRequest request){
		Format format = new SimpleDateFormat("yyyy-MM-dd");
		if(datetime==null){
			datetime = format.format(new Date());
		}
		List<Ticket> tickets = orderService.getAllTicket(datetime);
		request.setAttribute("tickets", tickets);
		String now = format.format(new Date());
		request.setAttribute("now", now);
		return "order/TicketList";
	}
	
	@RequestMapping("pay")
	public String pay(double money,HttpServletRequest request){
		User user = (User) request.getSession().getAttribute("user");
		user.setMoney(money);
		orderService.userPay(user);
		User user1 = userService.getUserByUid(user.getUid());
		user1.setMoney(money);
		request.setAttribute("user", user1);
		return "order/paySuccess";
	}
	
	@RequestMapping("myCar")
	public String myCar(HttpServletRequest request){
		User user = (User) request.getSession().getAttribute("user");
		List<Ticket> tickets = orderService.getMyCar(user.getUid());
		Integer totalnum = 0;
		double totalprice = 0;
		for (Ticket ticket : tickets) {
			totalnum += ticket.getTnum();
			totalprice += ticket.getPrice()*ticket.getTnum();
		}
		request.setAttribute("tickets", tickets);
		request.setAttribute("totalnum", totalnum);
		request.setAttribute("totalprice", totalprice);
		return "order/myCar";
	}
	
	@RequestMapping("updateTnum/{tid}/{tnum}")
	public String updateTnum(HttpServletRequest request,@PathVariable Integer tid,@PathVariable Integer tnum){
		User user = (User) request.getSession().getAttribute("user");
		orderService.updateTnum(new Car(null, tid, user.getUid(), tnum));
		return "redirect:/myCar";
	}
	
	@RequestMapping("deleteCar/{tid}")
	public String deleteCar(HttpServletRequest request,@PathVariable Integer tid){
		User user = (User) request.getSession().getAttribute("user");
		orderService.deleteCar(new Car(null, tid, user.getUid(), null));
		return "redirect:/myCar";
	}
	
	@ResponseBody
	@RequestMapping("buyClose")
	public String buyClose(HttpServletRequest request){
		try {
			User user = (User) request.getSession().getAttribute("user");
			boolean flag = orderService.buyClose(user.getUid());
			if(flag){
				return "1";
			}else{
				return "0";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "-1";
		}
	}
	
	@ResponseBody
	@RequestMapping("addCar")
	public String addCar(HttpServletRequest request,Car car){
		try {
			User user = (User) request.getSession().getAttribute("user");
			car.setUid(user.getUid());
			orderService.addCar(car);
			return "1";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "0";
		}
	}
	
	@RequestMapping("payMoney")
	public String payMoney(HttpServletRequest request){
		User user = (User) request.getSession().getAttribute("user");
		if(user==null){
			request.setAttribute("error", "您还没有登录!");
			return "user/login";
		}else{
			return "order/payMoney";
		}
	}

}
