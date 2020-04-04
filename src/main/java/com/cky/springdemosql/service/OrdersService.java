package com.cky.springdemosql.service;

import com.cky.springdemosql.entity.Orders;

import java.util.List;

/**
 * @Author: cky
 * @Date: 2020/4/3 21:06
 * @Description:
 */
public interface OrdersService {
    List<Orders> findAll();
    int insert(Orders orders);
    int update(Orders orders);
    int delete(Integer id);
}