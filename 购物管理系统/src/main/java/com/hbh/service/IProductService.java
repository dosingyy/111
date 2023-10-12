package com.hbh.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.hbh.entity.Product;
import com.hbh.entity.ProductExample;

public interface IProductService {
    int deleteByPrimaryKey(String proid);
    int insert(Product record);
    List<Product> selectByExample(ProductExample example);
    public List<Product> getlist();
    Product selectByPrimaryKey(String proid);
    List<Product> getbyparams( String proid,String supname,String pname,String protype );
    boolean updateByPrimaryKey(Product record);
    }
