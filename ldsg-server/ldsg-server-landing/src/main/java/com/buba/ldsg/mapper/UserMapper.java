package com.buba.ldsg.mapper;

import com.buba.ldsg.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    //登陆
    User toLogin(User user);
}
