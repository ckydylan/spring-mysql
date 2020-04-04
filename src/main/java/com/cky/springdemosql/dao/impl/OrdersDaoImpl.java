package com.cky.springdemosql.dao.impl;

import com.cky.springdemosql.dao.OrdersDao;
import com.cky.springdemosql.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: cky
 * @Date: 2020/4/3 21:07
 * @Description:
 */
@Repository("ordersDao")
public class OrdersDaoImpl implements OrdersDao {
    String querySql = "select * from orders";
    String insertSql = "insert into orders(name,time,price,num) values (?,?,?,?)";
    String deleteSql = "delete from orders where id = ?";
    String updateSql = "update orders set num = ? where id = ?";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Orders> findAll() {
        return jdbcTemplate.query(querySql,(rs,rowNum)->
                Orders.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .time(rs.getString("time"))
                        .price(rs.getInt("price"))
                        .num(rs.getInt("num"))
                        .build());
    }

    @Override
    public int insert(Orders orders) {
        return jdbcTemplate.update(insertSql,orders.getName(),orders.getTime(),orders.getPrice(),orders.getNum());
    }

    @Override
    public int update(Orders orders) {
        return jdbcTemplate.update(updateSql,orders.getNum(),orders.getId());
    }

    @Override
    public int delete(Integer id) {
        return jdbcTemplate.update(deleteSql,id);
    }
}