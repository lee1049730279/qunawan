package com.zl.qunawan.dao;

import com.zl.qunawan.pojo.po.Sequence;
import com.zl.qunawan.pojo.po.SequenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SequenceMapper {
    int countByExample(SequenceExample example);

    int deleteByExample(SequenceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Sequence record);

    int insertSelective(Sequence record);

    List<Sequence> selectByExample(SequenceExample example);

    Sequence selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Sequence record, @Param("example") SequenceExample example);

    int updateByExample(@Param("record") Sequence record, @Param("example") SequenceExample example);

    int updateByPrimaryKeySelective(Sequence record);

    int updateByPrimaryKey(Sequence record);
}