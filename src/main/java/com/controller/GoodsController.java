package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.GoodsService;

@Controller
public class GoodsController {
	@Resource
	private GoodsService goodsServiceImpl;
	@RequestMapping("show")
	public String show(Model model){
		model.addAttribute("list", goodsServiceImpl.showAllGoods());
		return "index.jsp";
	}
}
