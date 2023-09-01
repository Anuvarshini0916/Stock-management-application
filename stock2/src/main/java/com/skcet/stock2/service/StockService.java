package com.skcet.stock2.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.skcet.stock2.model.StockDetails;

public interface StockService {
	public boolean addUser(StockDetails stock);
	public List<StockDetails> getUser();
	public boolean updateUser(Long id, StockDetails stock);
	public boolean deleteUser(Long id);
	public Page<StockDetails> getAllUser(PageRequest pageRequest);
	List<StockDetails> findAllQuery();
	
	public StockDetails findProductname();
	StockDetails findByProductname(String productname);
	StockDetails findByProductname();

}
