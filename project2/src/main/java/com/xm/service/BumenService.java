package com.xm.service;

import java.util.List;

import com.xm.entity.Bumen;
import com.xm.vo.BumenVo;

public interface BumenService {
	public Boolean add(Bumen bumen);
	
	public Boolean edit(Bumen bumen);
	
	public Boolean delete(int id);

	public List<Bumen> searchAll();
	
	public Bumen searchById(int id);
	
	public List<BumenVo> getData();
}
