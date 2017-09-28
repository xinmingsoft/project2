package com.xm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xm.entity.Bumen;
import com.xm.mapper.BumenMapper;
import com.xm.service.BumenService;
import com.xm.vo.BumenVO;

@Service
@Transactional
public class BumenServiceImpl implements BumenService {
	
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
	
	public List<BumenVO> getData() {
		List<BumenVO> list = bumenmapper.getData();
		return list;
	}

}
