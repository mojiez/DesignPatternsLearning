package com.atkj.singleton.lan;
// 维护一个身份证号码 每个居民身份证号码具有唯一性
public class IndentityCardNo {
    // 维护这个唯一的单例
    // static 这个instance由类维护
    // 私有方法/成员变量 只能在声明他们的类中被访问调用
    private static IndentityCardNo instance = null;
    private String no;
    private IndentityCardNo(){}
    public static IndentityCardNo getInstance() {
        if (instance == null) {
            System.out.println("第一次办身份证，分配号码");
            instance = new IndentityCardNo();
            instance.setNo("No123456");
        }
        return instance;
    }
    // 有一个嵌套的感觉 instance中的No
    private void setNo(String No) {
        this.no = No;
    }
    public String getNo() {
        return this.no;
    }
}
