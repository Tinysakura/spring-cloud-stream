package com.cfh.study.springcloudstream;

/**
 * @Author: cfh
 * @Date: 2018/9/12 19:13
 * @Description:
 */
public class My {
    String name;
    String age;

    @Override
    public String toString() {
        return "My{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
