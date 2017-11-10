package com.zl.qunawan.dao;

import com.zl.qunawan.pojo.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao-test.xml"})
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testSelectByPrimaryKey() throws Exception {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user.getName());

    }

}