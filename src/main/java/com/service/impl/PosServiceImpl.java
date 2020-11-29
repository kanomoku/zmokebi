package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.PosMapper;
import com.pojo.Pos;
import com.service.PosService;

@Service
public class PosServiceImpl implements PosService{
	@Resource
	private PosMapper posMapper;

	public PosMapper getPosMapper() {
		return posMapper;
	}

	public void setPosMapper(PosMapper posMapper) {
		this.posMapper = posMapper;
	}

	@Override
	public List<Pos> showAllPos() {
		return null;
//		List<Menu> selByPid = PosMapper.selByPid(0);
//		return selByPid;
	}

	@Override
	public int insertPos(Pos pos) {
		return posMapper.insertPos(pos);
	}

}