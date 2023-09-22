package com.mmg.mysqlCluster.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mmg.mysqlCluster.entities.Vehicle;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VehicleMapper extends BaseMapper<Vehicle> {
    List<Vehicle> selectList1();
}
