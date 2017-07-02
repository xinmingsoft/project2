package com.xm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xm.entity.Bumen;
import com.xm.mapper.BumenMapper;
import com.xm.service.IBaseService;
import com.xm.vo.BumenVo;

@Service
@Transactional
public class BumenService implements IBaseService<Bumen> {
	
	@Autowired
	BumenMapper bumenmapper;

	public Boolean add(Bumen t) {
		Boolean flag = true;
		Integer sqlFlag = bumenmapper.add(t);
		if(sqlFlag != 1){
			flag = false;
		}
		return flag;
	}

	public Boolean edit(Bumen t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Bumen> searchAll() {
		List<Bumen> list = bumenmapper.searchAll();
		return list;
	}

	public Bumen searchById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<BumenVo> getData() {
		List<BumenVo> list = bumenmapper.getData();
		return list;
	}

}
