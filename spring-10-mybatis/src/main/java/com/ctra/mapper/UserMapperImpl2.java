package com.ctra.mapper;

import com.ctra.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;


import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    public List<User> getUserList() {
//        SqlSession session =getSqlSession();
//        UserMapper mapper = session.getMapper(UserMapper.class);
//        return mapper.getUserList();

        // 上下等价

        //        简化成一句话
        return getSqlSession().getMapper(UserMapper.class).getUserList();
    }
}
