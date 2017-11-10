package com.zl.qunawan.dao;

import com.zl.qunawan.pojo.po.Dates;
import com.zl.qunawan.pojo.po.DatesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DatesMapper {
    int countByExample(DatesExample example);

    int deleteByExample(DatesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dates record);

    int insertSelective(Dates record);

    List<Dates> selectByExample(DatesExample example);

    Dates selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dates record, @Param("example") DatesExample example);

    int updateByExample(@Param("record") Dates record, @Param("example") DatesExample example);

    int updateByPrimaryKeySelective(Dates record);

    int updateByPrimaryKey(Dates record);
}