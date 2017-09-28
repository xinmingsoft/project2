package com.xm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xm.entity.Zhiwu;
import com.xm.service.ZhiwuService;

@Controller
@RequestMapping(value = "/zhiwu")
public class ZhiwuController {
	@Autowired
	ZhiwuService zhiwuService;
	
	@ResponseBody
	@RequestMapping(value = "/searchAllZhiwu",method = RequestMethod.GET)
	public Object getAll(HttpServletRequest request,HttpServletResponse response){
		List<Zhiwu> list = zhiwuService.searchAll();
		return list;
	}
}
