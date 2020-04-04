package com.cky.springdemosql.filter;

import com.alibaba.druid.filter.FilterChain;
import com.alibaba.druid.filter.FilterEventAdapter;
import com.alibaba.druid.proxy.jdbc.ConnectionProxy;
import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

/**
 * @Author: cky
 * @Date: 2020/4/2 11:07
 * @Description:
 */
@Slf4j
public class ConnLogFilter extends FilterEventAdapter {

    @Override
    public void connection_connectBefore(FilterChain chain, Properties info) {
        log.info("connectBefore,info:"+info.toString());
    }

    @Override
    public void connection_connectAfter(ConnectionProxy connection) {
        log.info("connectBefore,connection:"+connection.toString());

    }
}