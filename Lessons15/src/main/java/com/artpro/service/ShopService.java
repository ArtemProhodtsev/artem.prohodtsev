package com.artpro.service;

import com.artpro.exceptions.ProductAlreadyExistsException;
import com.artpro.model.Product;

import java.util.List;

public interface ShopService {

    void addProduct(Product product) throws ProductAlreadyExistsException;

    boolean startShop();

    List<Product> getAllProduct();

    void closeShop();
}