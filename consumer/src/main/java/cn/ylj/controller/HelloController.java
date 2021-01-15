package cn.ylj.controller;

import cn.ylj.service.IHelloService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author : yanglujian
 * create at:  2021/1/15  1:57 下午
 */
@Controller
@RequestMapping("/hello")
@ResponseBody
public class HelloController {

    @Reference
    private IHelloService helloService;

    @RequestMapping("/dubbo")
    public String testSay(){
        return helloService.sayhello();
    }

}