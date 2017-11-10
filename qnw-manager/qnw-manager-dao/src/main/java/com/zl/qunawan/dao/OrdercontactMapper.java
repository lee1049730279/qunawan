package com.zl.qunawan.dao;

import com.zl.qunawan.pojo.po.Ordercontact;
import com.zl.qunawan.pojo.po.OrdercontactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrdercontactMapper {
    int countByExample(OrdercontactExample example);

    int deleteByExample(OrdercontactExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ordercontact record);

    int insertSelective(Ordercontact record);

    List<Ordercontact> selectByExample(OrdercontactExample example);

    Ordercontact selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ordercontact record, @Param("example") OrdercontactExample example);

    int updateByExample(@Param("record") Ordercontact record, @Param("example") OrdercontactExample example);

    int updateByPrimaryKeySelective(Ordercontact record);

    int updateByPrimaryKey(Ordercontact record);
}