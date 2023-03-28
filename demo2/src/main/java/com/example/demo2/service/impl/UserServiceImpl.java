package com.example.demo2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo2.model.User;
import com.example.demo2.service.UserService;
import com.example.demo2.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
*
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
implements UserService{

}
