package com.zl.qunawan.dao;

import com.zl.qunawan.pojo.po.Commentpicture;
import com.zl.qunawan.pojo.po.CommentpictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentpictureMapper {
    int countByExample(CommentpictureExample example);

    int deleteByExample(CommentpictureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Commentpicture record);

    int insertSelective(Commentpicture record);

    List<Commentpicture> selectByExample(CommentpictureExample example);

    Commentpicture selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Commentpicture record, @Param("example") CommentpictureExample example);

    int updateByExample(@Param("record") Commentpicture record, @Param("example") CommentpictureExample example);

    int updateByPrimaryKeySelective(Commentpicture record);

    int updateByPrimaryKey(Commentpicture record);
}