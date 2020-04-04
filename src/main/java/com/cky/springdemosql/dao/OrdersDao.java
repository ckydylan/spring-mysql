package com.cky.springdemosql.dao;

import com.cky.springdemosql.entity.Orders;

import java.util.List;

/**
 * @Author: cky
 * @Date: 2020/4/3 21:07
 * @Description:
 */

public interface OrdersDao {
    List<Orders> findAll();
    int insert(Orders orders);
    int update(Orders orders);
    int delete(Integer id);
}
