package cn.ylj.controller;

import cn.ylj.api.IUserSerivce;
import cn.ylj.entity.UserEntity;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : yanglujian
 * create at:  2021/1/15  5:21 下午
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    IUserSerivce userSerivce;

    @RequestMapping("/findAll")
    public List<UserEntity> findAll(){
        List<UserEntity> user = userSerivce.findAll();
        return user;
    }

    @RequestMapping("/update")
    public void update(){
        userSerivce.update();
    }
}