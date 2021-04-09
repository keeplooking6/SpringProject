package edu.zc.service;

import edu.zc.dao.IMsgDao;
import edu.zc.dao.IProductDao;
import lombok.AllArgsConstructor;
import lombok.Setter;

//@Setter
@AllArgsConstructor
public class ProductServiceImpl implements IProductService{
    private IMsgDao iMsgDao;
    private IProductDao iProductDao;


    @Override
    public void queryAndAdd() {
        iMsgDao.sendMsg();
        iProductDao.addProduct();
        iProductDao.queryProduct();
    }
}
