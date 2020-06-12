package com.qry.stream.test;

/**
 * @ClassName User
 * @Package com.qry.stream.test
 * @Description
 * @Author qurongyao
 * @Date 2020/6/12 11:08
 * @Version 1.0
 */
public class User {
    private Integer id;

    private String name;

    private Integer age;

    public User(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

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
}
