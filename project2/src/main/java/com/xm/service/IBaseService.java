package com.xm.service;

import java.util.List;

public interface IBaseService<T> {
	public Boolean add(T t);
	
	public Boolean edit(T t);
	
	public Boolean delete(int id);

	public List<T> searchAll();
	
	public T searchById(int id);
}
