package com.skcet.stock2.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.skcet.stock2.model.StockDetails;

public interface StockDetailsRepo extends JpaRepository<StockDetails, Long>{
boolean existsByProductname(String productname);
	
	Optional<StockDetails> findById(Long id);
	
	void deleteById(Long id);
    @Query("select s from StockDetails s")
    List<StockDetails> findAllQuery();
    @Query("select s from StockDetails s where s.productname= :productname")
    StockDetails findByProductname(@Param("productname")String productname); 

}
