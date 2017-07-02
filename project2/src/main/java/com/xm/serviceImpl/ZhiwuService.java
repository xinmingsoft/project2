package com.xm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xm.entity.Zhiwu;
import com.xm.mapper.ZhiwuMapper;
import com.xm.service.IBaseService;

@Service
@Transactional
public class ZhiwuService implements IBaseService<Zhiwu> {
	
	@Autowired
	ZhiwuMapper zhiwuMapper;

	public Boolean add(Zhiwu t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean edit(Zhiwu t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Zhiwu> searchAll() {
		return zhiwuMapper.searchAll();
	}

	public Zhiwu searchById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
