package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.StoreMapper;
import com.pojo.Store;
import com.service.StoreService;

@Service
public class StoreServiceImpl implements StoreService{
	@Resource
	private StoreMapper storeMapper;

	public StoreMapper getStoreMapper() {
		return storeMapper;
	}

	public void setStoreMapper(StoreMapper storeMapper) {
		this.storeMapper = storeMapper;
	}

	@Override
	public List<Store> showAllStore() {
		return null;
//		List<Menu> selByPid = StoreMapper.selByPid(0);
//		return selByPid;
	}

	@Override
	public int insertStore(Store store) {
		return storeMapper.insertStore(store);
	}

}
