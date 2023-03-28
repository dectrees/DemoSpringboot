package com.alex.demo3.mapper;

import com.alex.demo3.model.User;

/**
 * @Entity com.alex.demo3.model.User
 */
public interface UserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
