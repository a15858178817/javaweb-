package service;

import java.util.List;

import mapper.Buy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.*;
@Controller
public class BuyService {
private ApplicationContext ctx;

	@RequestMapping("/find_items")
	public String find_items(Model m)
	{
		ctx=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		Buy daoBuy=ctx.getBean(Buy.class);
		List<Items> list=daoBuy.find_items();
		m.addAttribute("items_list",list);
		return "jsp/items_list.jsp";
	}
	@RequestMapping("/find_itemById")
	public String find_itemById(Model m,int id)
	{
		ctx=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		Buy daoBuy=ctx.getBean(Buy.class);
		Items items=daoBuy.find_itemsById(id);
		m.addAttribute("items",items);
		return "jsp/update_items.jsp";		
	}
	@RequestMapping("/update_items")
	public String update_items(Items item)
	{
		ctx=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		Buy daoBuy=ctx.getBean(Buy.class);
		daoBuy.update_items(item);
		return "find_items.action";
	}
	
	@RequestMapping("/delete_items")
	public String delete_items(int id)
	{
		ctx=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		Buy daoBuy=ctx.getBean(Buy.class);
		daoBuy.delete_items(id);
		return "find_items.action";
	}
	@RequestMapping("/insert")
	public String insert_items(Items items)
	{
		ctx=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		Buy daoBuy=ctx.getBean(Buy.class);
		daoBuy.insert_items(items);
		return "find_items.action";		
	}
	@RequestMapping("/mohu_select")
	public String mohu_select(String info,Model m)
	{
		ctx=new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		Buy daoBuy=ctx.getBean(Buy.class);
		List<Items> list=daoBuy.mohu_select(info);
		m.addAttribute("items_list", list);
		return "jsp/items_list.jsp";			
	}
}
