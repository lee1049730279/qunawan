package com.zl.qunawan.dao;

import com.zl.qunawan.pojo.po.Trip;
import com.zl.qunawan.pojo.po.TripExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TripMapper {
    int countByExample(TripExample example);

    int deleteByExample(TripExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Trip record);

    int insertSelective(Trip record);

    List<Trip> selectByExample(TripExample example);

    Trip selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Trip record, @Param("example") TripExample example);

    int updateByExample(@Param("record") Trip record, @Param("example") TripExample example);

    int updateByPrimaryKeySelective(Trip record);

    int updateByPrimaryKey(Trip record);
}