package com.javacode2018.chat05.demo1.mapper;

import com.javacode2018.chat05.demo1.model.OrderModel;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    OrderModel getById(int id);

    OrderModel getById1(int id);

    OrderModel getById2(int id);

}
