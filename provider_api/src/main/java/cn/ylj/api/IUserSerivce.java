package cn.ylj.api;

import cn.ylj.entity.UserEntity;

import java.util.List;

/**
 * @author : yanglujian
 * create at:  2021/1/15  4:46 下午
 */
public interface IUserSerivce {

    List<UserEntity> findAll();

    void update();
}