package com.zl.qunawan.dao;

import com.zl.qunawan.pojo.po.Traffic;
import com.zl.qunawan.pojo.po.TrafficExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrafficMapper {
    int countByExample(TrafficExample example);

    int deleteByExample(TrafficExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Traffic record);

    int insertSelective(Traffic record);

    List<Traffic> selectByExample(TrafficExample example);

    Traffic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Traffic record, @Param("example") TrafficExample example);

    int updateByExample(@Param("record") Traffic record, @Param("example") TrafficExample example);

    int updateByPrimaryKeySelective(Traffic record);

    int updateByPrimaryKey(Traffic record);
}