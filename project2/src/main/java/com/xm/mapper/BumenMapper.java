package com.xm.mapper;

import java.util.List;

import com.xm.entity.Bumen;
import com.xm.vo.BumenVO;

public interface BumenMapper {
	
	public Integer add(Bumen t);

	public Integer edit(Bumen t);

	public Integer delete(int id) ;

	public List<Bumen> searchAll();

	public Bumen searchById(int id);
	
	public List<BumenVO> getData();
}
