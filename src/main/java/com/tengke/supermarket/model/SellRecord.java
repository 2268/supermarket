package com.tengke.supermarket.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import java.util.Date;
import java.util.List;

/**
 * @author : cgs
 * @Description ： 销售记录
 * @date 2020年7月26日20:41:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SellRecord {
    /**
     *  销售编号
     */
    private Integer sellId;

    /**
     *  员工编号
     */
    @NonNull
    private Integer sfId;

    /**
     * 销售日期
      */
    @NonNull
    private Date sellDate;


}
