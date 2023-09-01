package com.skcet.stock2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.skcet.stock2.model.StockDetails;
import com.skcet.stock2.repository.StockDetailsRepo;
import com.skcet.stock2.service.StockService;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class StockServiceImpl implements StockService{
	@Autowired
	private StockDetailsRepo stockDetailsRepo;

	@Override
	public boolean addUser(StockDetails stock) {
		boolean userExists = stockDetailsRepo.existsByProductname(stock.getProductname());
		if(!userExists) {
			stockDetailsRepo.save(stock);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<StockDetails> getUser() {
		return stockDetailsRepo.findAll();
	}

	@Override
	public boolean updateUser(Long id,StockDetails stock) {
		Optional<StockDetails> existingUserOptional = stockDetailsRepo.findById(id);
		if(existingUserOptional.isPresent()) {
			StockDetails userExists = existingUserOptional.get();
			userExists.setProductname(stock.getProductname());
			
			stockDetailsRepo.save(userExists);
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public boolean deleteUser(Long id) {
		Optional<StockDetails> existingUserOptional = stockDetailsRepo.findById(id);
		if(existingUserOptional.isPresent()) {
			stockDetailsRepo.deleteById(id);
			return true;
		} else {
			return false;
		}
	}
	@Override
	public Page<StockDetails> getAllUser(PageRequest pageRequest){
		return stockDetailsRepo.findAll(pageRequest);
	}
	@Override
	public List<StockDetails> findAllQuery(){
		return stockDetailsRepo.findAllQuery();
	}
	@Override
	public StockDetails findByProductname(String productname) {
		return stockDetailsRepo.findByProductname(productname);
	}
//

	@Override
	public StockDetails findProductname() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StockDetails findByProductname() {
		// TODO Auto-generated method stub
		return null;
	}
	



}
