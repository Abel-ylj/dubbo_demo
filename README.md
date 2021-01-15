# Dubbo

## 简介

1. Dubbo 前生是阿里的Java RPC框架，可以和Spring无缝集成，目前已经捐献给Apache 管理
2. java中类似的RPC框架有RMI,Hession
3. Dubbo提供了三大核心功能
    1. 面向接口的远程过程调用
    2. 智能容错和负载均衡 
    3. 服务自动注册和发现

## SOA

1. 面向服务的架构
2. 可以让服务实现编排，实现业务的灵活组建
3. 如下图中的基础用户服务和订单服务可以被两个不同的系统共同依赖

![image-20210114203849583](https://yljnote.oss-cn-hangzhou.aliyuncs.com/2021-01-14-123850.png)



### 架构

![dubbo架构](http://dubbo.apache.org/imgs/user/dubbo-architecture.jpg)

节点角色说明

| 节点        | 角色说明                               |
| ----------- | -------------------------------------- |
| `Provider`  | 暴露服务的服务提供方                   |
| `Consumer`  | 调用远程服务的服务消费方               |
| `Registry`  | 服务注册与发现的注册中心               |
| `Monitor`   | 统计服务的调用次数和调用时间的监控中心 |
| `Container` | 服务运行容器                           |

## Register注册中心-zookeeper

- zookeeper是一个树状结构的目录服务

- 支持变更推送，目录有变更，根据长连接推送给消费方

    ![image-20210114222743873](https://yljnote.oss-cn-hangzhou.aliyuncs.com/2021-01-14-142744.png)

## 安装注意点

1. 复制conf/zoo_sample.cfg 为zoo.cfg
2. 将其中的dataDir修改到/usr/local/zookeeper-3.4.6/data ，data为新建数据文件夹

## 常用命令

1. 启动 

    ```sh
    ./zkServer.sh start
    ```



## 监控服务部署

- 将监控war包部署后，配置dubbo.properties文件中zk的地址，启动后会自动监控
- http://121.4.53.107:8080/dubbo-admin-2.6.0/

## 使用

- 导坐标

    ```xml
    <!-- dubbo相关 -->
            <dependency>
                <groupId>com.alibaba</groupId>
                <artifactId>dubbo</artifactId>
                <version>2.6.0</version>
            </dependency>
    
    <!-- zookeeper注册中心 -->
            <dependency>
                <groupId>org.apache.zookeeper</groupId>
                <artifactId>zookeeper</artifactId>
                <version>3.4.7</version>
            </dependency>
            <dependency>
                <groupId>com.github.sgroschupf</groupId>
                <artifactId>zkclient</artifactId>
                <version>0.1</version>
            </dependency>
    
    <!-- 动态代理，构建字节码 -->
            <dependency>
                <groupId>javassist</groupId>
                <artifactId>javassist</artifactId>
                <version>3.12.1.GA</version>
            </dependency>
    
    <!-- 对象传输，序列化 -->
            <dependency>
                <groupId>com.alibaba</groupId>
                <artifactId>fastjson</artifactId>
                <version>1.2.47</version>
            </dependency>
    ```

    