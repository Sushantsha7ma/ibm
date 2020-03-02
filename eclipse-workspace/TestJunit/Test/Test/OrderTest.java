package Test;

import java.sql.SQLException;

import org.junit.*;


import Shop.BOException;
import Shop.Order;
import Shop.OrderBO;
import Shop.OrderBOImpl;
import Shop.OrderDaoImpl;


public class OrderTest 
{
	@Test
	public void test1() throws SQLException, BOException
	{
		OrderDaoImpl dao = new OrderDaoImpl();
		OrderBO bo = new OrderBOImpl(dao);
		Order o = new Order();
		boolean is = bo.placeOrder(o);
		Assert.assertFalse(is);
	}

}
