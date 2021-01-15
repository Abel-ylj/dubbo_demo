package cn.ylj.mapper;


import cn.ylj.entity.UserEntity;

import java.util.List;

public interface UserMapper {

    List<UserEntity> findAll();

    int deleteByPrimaryKey(Integer id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);
}