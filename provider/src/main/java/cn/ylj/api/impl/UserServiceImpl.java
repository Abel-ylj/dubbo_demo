package cn.ylj.api.impl;

import cn.ylj.api.IUserSerivce;
import cn.ylj.entity.UserEntity;
import cn.ylj.mapper.UserMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : yanglujian
 * create at:  2021/1/15  4:45 下午
 */
@Service(interfaceClass = IUserSerivce.class)
public class UserServiceImpl implements IUserSerivce {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<UserEntity> findAll() {
        return userMapper.findAll();
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void update() {
        UserEntity user = userMapper.selectByPrimaryKey(1);
        user.setAge(10086);
        userMapper.updateByPrimaryKey(user);
        int i = 1/0;
        user.setAge(10010);
        userMapper.updateByPrimaryKey(user);
    }
}