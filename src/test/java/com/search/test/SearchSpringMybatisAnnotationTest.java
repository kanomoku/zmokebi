package com.search.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Goods;
import com.service.impl.GoodsServiceImpl;

public class SearchSpringMybatisAnnotationTest {
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContextSpringMybatisAnnotation.xml");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
		String[] beanDefinitionNames = ac.getBeanDefinitionNames();
		for (String string : beanDefinitionNames) {
			System.out.println(string);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");

		Logger logger = Logger.getLogger(SearchSpringMybatisAnnotationTest.class);

		logger.info("--------------------search goods");
		GoodsServiceImpl goodsServiceImpl = ac.getBean("goodsServiceImpl", GoodsServiceImpl.class);
		List<Goods> goods = goodsServiceImpl.showAllGoods();
		for (int i = 0; i < goods.size(); i++) {
			System.out.print(goods.get(i));
		}
		
	}

}
