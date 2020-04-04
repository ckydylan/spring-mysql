package com.cky.springdemosql.controller;

import com.cky.springdemosql.entity.Orders;
import com.cky.springdemosql.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: cky
 * @Date: 2020/4/4 09:16
 * @Description:
 */
@RestController
public class OrdersController {
    @Autowired
    OrdersService ordersService;

    @GetMapping("/orders/findAll")
    public List<Orders> findAll() {
        return ordersService.findAll();
    }

    @PostMapping("/orders/insert")
    public int insert(@RequestBody Orders orders) {
        return ordersService.insert(orders);
    }

    @DeleteMapping("/orders/delete/{id}")
    public int delete(@PathVariable("id") Integer id) {
        return ordersService.delete(id);
    }

    @PostMapping("/message/update")
    public int update(@RequestBody Orders orders){
        return  ordersService.update(orders);
    }

}