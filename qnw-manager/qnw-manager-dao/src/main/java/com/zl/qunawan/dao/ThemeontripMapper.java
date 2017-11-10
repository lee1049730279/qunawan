package com.zl.qunawan.dao;

import com.zl.qunawan.pojo.po.Themeontrip;
import com.zl.qunawan.pojo.po.ThemeontripExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThemeontripMapper {
    int countByExample(ThemeontripExample example);

    int deleteByExample(ThemeontripExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Themeontrip record);

    int insertSelective(Themeontrip record);

    List<Themeontrip> selectByExample(ThemeontripExample example);

    Themeontrip selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Themeontrip record, @Param("example") ThemeontripExample example);

    int updateByExample(@Param("record") Themeontrip record, @Param("example") ThemeontripExample example);

    int updateByPrimaryKeySelective(Themeontrip record);

    int updateByPrimaryKey(Themeontrip record);
}