package com.mybatis.dao;

import org.apache.ibatis.annotations.Param;

import com.mybatis.domain.Product;

public interface ProductMapper {
	
	Product getProductByproID(@Param("proID")int d);

}
