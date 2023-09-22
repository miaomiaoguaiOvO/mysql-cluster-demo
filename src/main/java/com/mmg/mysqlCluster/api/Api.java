package com.mmg.mysqlCluster.api;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.mmg.mysqlCluster.entities.Vehicle;
import com.mmg.mysqlCluster.enums.VehicleSizeEnum;
import com.mmg.mysqlCluster.enums.VehicleTypeEnum;
import com.mmg.mysqlCluster.mapper.VehicleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: fan
 * @Date: 2023/9/21
 * @Description:
 */
@RequestMapping("/")
@RestController
public class Api {
    @Autowired
    private VehicleMapper vehicleMapper;

    @GetMapping("/query")
    @Transactional(rollbackFor = Exception.class)
    public List<Vehicle> query() {
        return vehicleMapper.selectList(Wrappers.<Vehicle>lambdaQuery().last("limit 1"));
    }

    @GetMapping("/insert")
    public int insert() {
        Vehicle build = Vehicle.builder().plateNum("AAAAAA").vehicleType(VehicleTypeEnum.FUEL).vehicleSize(VehicleSizeEnum.SMALL).build();
        int insert = vehicleMapper.insert(build);
        System.out.println(build);
        return insert;
    }

    @GetMapping("/query1")
    public List<Vehicle> query1() {
        PageHelper.startPage(1, 5);
        return vehicleMapper.selectList1();
    }

    @GetMapping("/query2")
    public List<Vehicle> query2() {
        return Arrays.asList(vehicleMapper.selectById(1524676964086026242L));
    }
}
