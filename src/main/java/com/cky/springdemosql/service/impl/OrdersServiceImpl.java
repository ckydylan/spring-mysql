package com.cky.springdemosql.service.impl;

import com.cky.springdemosql.dao.OrdersDao;
import com.cky.springdemosql.entity.Orders;
import com.cky.springdemosql.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: cky
 * @Date: 2020/4/3 21:06
 * @Description:
 */
@Service("orderService")
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    OrdersDao ordersDao;

    @Override
    public List<Orders> findAll() {
        return ordersDao.findAll();
    }

    @Override
    public int insert(Orders orders) {
        return ordersDao.insert(orders);
    }

    @Override
    public int update(Orders orders) {
        return ordersDao.update(orders);
    }

    @Override
    public int delete(Integer id) {
        return ordersDao.delete(id);
    }
}