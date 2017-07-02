package com.xm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xm.entity.Zhiwu;

public interface ZhiwuMapper {
	
	public Integer add(Zhiwu t);

	public Integer edit(Zhiwu t);

	public Integer delete(int id);

	public List<Zhiwu> searchAll();

	public Zhiwu searchById(int id);
}
