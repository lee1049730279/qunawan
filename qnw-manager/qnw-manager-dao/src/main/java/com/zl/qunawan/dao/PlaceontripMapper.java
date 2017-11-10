package com.zl.qunawan.dao;

import com.zl.qunawan.pojo.po.Placeontrip;
import com.zl.qunawan.pojo.po.PlaceontripExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlaceontripMapper {
    int countByExample(PlaceontripExample example);

    int deleteByExample(PlaceontripExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Placeontrip record);

    int insertSelective(Placeontrip record);

    List<Placeontrip> selectByExample(PlaceontripExample example);

    Placeontrip selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Placeontrip record, @Param("example") PlaceontripExample example);

    int updateByExample(@Param("record") Placeontrip record, @Param("example") PlaceontripExample example);

    int updateByPrimaryKeySelective(Placeontrip record);

    int updateByPrimaryKey(Placeontrip record);
}