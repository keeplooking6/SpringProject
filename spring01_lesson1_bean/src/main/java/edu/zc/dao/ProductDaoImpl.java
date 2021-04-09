package edu.zc.dao;

public class ProductDaoImpl implements IProductDao{

    @Override
    public void addProduct() {
        System.out.println("addProduct----");
    }

    @Override
    public void queryProduct() {
        System.out.println("queryProduct----");
    }
}
