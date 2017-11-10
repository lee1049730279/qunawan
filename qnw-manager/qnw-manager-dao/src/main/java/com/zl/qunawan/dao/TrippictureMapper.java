package com.zl.qunawan.dao;

import com.zl.qunawan.pojo.po.Trippicture;
import com.zl.qunawan.pojo.po.TrippictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrippictureMapper {
    int countByExample(TrippictureExample example);

    int deleteByExample(TrippictureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Trippicture record);

    int insertSelective(Trippicture record);

    List<Trippicture> selectByExample(TrippictureExample example);

    Trippicture selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Trippicture record, @Param("example") TrippictureExample example);

    int updateByExample(@Param("record") Trippicture record, @Param("example") TrippictureExample example);

    int updateByPrimaryKeySelective(Trippicture record);

    int updateByPrimaryKey(Trippicture record);
}