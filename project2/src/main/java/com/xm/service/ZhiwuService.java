package com.xm.service;

import java.util.List;

import com.xm.entity.Zhiwu;

public interface ZhiwuService {
	public Boolean add(Zhiwu t);
	
	public Boolean edit(Zhiwu t);
	
	public Boolean delete(int id);

	public List<Zhiwu> searchAll();
	
	public Zhiwu searchById(int id);
}
