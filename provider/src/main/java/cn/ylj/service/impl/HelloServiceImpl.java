package cn.ylj.service.impl;

import cn.ylj.service.IHelloService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author : yanglujian
 * create at:  2021/1/15  1:05 下午
 */
@Service
public class HelloServiceImpl implements IHelloService {

    public HelloServiceImpl(){
        System.out.println("HelloService初始化了");
    }
    @Override
    public String sayhello() {
        return "hello this msg passed by rpc dubbo + zk";
    }
}