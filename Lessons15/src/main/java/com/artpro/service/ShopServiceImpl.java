package com.artpro.service;

import com.artpro.exceptions.ProductAlreadyExistsException;
import com.artpro.model.Product;
import com.artpro.model.Shop;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ShopServiceImpl implements ShopService {
    private final Shop shop;

    @Override
    public void addProduct(Product product) throws ProductAlreadyExistsException {
        if (shop.getProducts().stream().noneMatch(pr -> pr.getId() == product.getId())) {
            shop.getProducts().add(product);
        } else {
            throw new ProductAlreadyExistsException("Продкут с таким Id " + product.getId() + " уже существует");
        }
    }

    @Override
    public boolean startShop() {
        return shop.isRunShop();
    }

    @Override
    public List<Product> getAllProduct() {
        return shop.getProducts();
    }

    @Override
    public void closeShop() {
        shop.setRunShop(false);
    }
}