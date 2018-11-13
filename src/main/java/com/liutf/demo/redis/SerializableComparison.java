package com.liutf.demo.redis;/**
 * Created by ltf on 2018-06-16.
 */

/**
 * 各种序列化工具性能占用空间对比
 *
 * @author ltf
 * @create 2018-06-16 上午 10:57
 */
public class SerializableComparison {


    public void javaSerializable() {
        //Jedis
    }


    public static void main(String[] args) {

    }


}

class Customer implements java.io.Serializable {

    private static final long serialVersionUID = -1L;

    private long id;
    private String nickName;
    private String mobile;
    private String password;
    private int age;
    private String realName;
    private int sex;//-1：保密；0：女；1：男

    public Customer(long id, String nickName, String mobile, String password, int age, String realName, int sex) {
        this.id = id;
        this.nickName = nickName;
        this.mobile = mobile;
        this.password = password;
        this.age = age;
        this.realName = realName;
        this.sex = sex;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", mobile='" + mobile + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", realName='" + realName + '\'' +
                ", sex=" + sex +
                '}';
    }
}