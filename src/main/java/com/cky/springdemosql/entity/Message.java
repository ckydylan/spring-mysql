package com.cky.springdemosql.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: cky
 * @Date: 2020/3/24 11:22
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Message {
    private Integer msgId;
    private String msgText;
    private String msgSummary;
}