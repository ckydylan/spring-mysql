package com.cky.springdemosql;

import com.cky.springdemosql.entity.Orders;
import com.cky.springdemosql.service.OrdersService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author: cky
 * @Date: 2020/4/3 21:17
 * @Description:
 */
@SpringBootTest
@Slf4j
public class OrdersTest {
    @Autowired
    OrdersService ordersService;

    @Test
    public void testFindAll(){
        List<Orders> all = ordersService.findAll();
        for (Orders orders : all) {
            log.info(orders.toString());
        }
    }
    @Test
    public void testDelete(){
        int delete = ordersService.delete(3);
        log.info(delete+"");
    }

    @Test
    public void testInsert(){
        Orders orders = Orders.builder().name("Oppo").time("2020-3-20 11:23:40").price(800).num(10).build();
        int insert = ordersService.insert(orders);
        log.info(insert+"");
    }

    @Test
    public void testUpdate(){
        Orders orders = Orders.builder().id(1).num(10).build();
        int update = ordersService.update(orders);
        log.info(update+"");
    }
}