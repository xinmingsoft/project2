package com.xm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.xm.entity.Bumen;
import com.xm.serviceImpl.BumenService;
import com.xm.vo.BumenVo;

@Controller
@RequestMapping(value = "/bumen")
public class BumenController {
	
	@Autowired
	BumenService bumenService;
	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(){
		return "bumen";
	}
	
	@ResponseBody
	@RequestMapping(value = "/searchAllBumen",method = RequestMethod.GET)
	public Object getAll(HttpServletRequest request,HttpServletResponse response){
		PageHelper.startPage(1, 2);
		List<Bumen> list = bumenService.searchAll();
		return list;
	}

	@ResponseBody
	@RequestMapping(value = "/addBumen",method = RequestMethod.POST)
	public String add(HttpServletRequest request,HttpServletResponse response, @RequestBody Bumen bumen){
		boolean flag = bumenService.add(bumen);
		if(flag){
			return "1";
		}else{
			return "0";
		}
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/getData")
	public Object getData(HttpServletRequest request,HttpServletResponse response){
		List<BumenVo> list = bumenService.getData();
		return list;
	}
	
	
	//@RequestParam("name") String name,
}
