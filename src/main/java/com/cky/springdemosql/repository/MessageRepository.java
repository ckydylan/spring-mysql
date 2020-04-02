package com.cky.springdemosql.repository;


import com.cky.springdemosql.entity.Message;

import java.util.List;

/**
 * @Author: cky
 * @Date: 2020/3/24 11:24
 * @Description:
 */
public interface MessageRepository {
    List<Message> findAll();
    Message findById(Integer id);
    int insert(Message message);
    int delete(Integer id);
    int update(Message message);
    int updateText(Message message);
    int[] batchInsert(List<Message> messages);
}