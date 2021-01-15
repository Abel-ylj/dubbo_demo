package cn.ylj.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : yanglujian
 * create at:  2021/1/15  4:40 下午
 */
public class UserEntity implements Serializable {

    private Integer id;

    private String name;

    private Integer age;

    private Date createAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}