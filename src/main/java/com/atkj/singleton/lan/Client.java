package com.atkj.singleton.lan;

public class Client {
    public static void main(String[] args) {
        IndentityCardNo instance = IndentityCardNo.getInstance();
        IndentityCardNo instance1 = IndentityCardNo.getInstance();
        System.out.println(instance1 == instance);
        // true 说明只有一个实例
        // 如何获取这个实例里面维护的no？
        String no = instance.getNo();
        System.out.println(no);
        // 这个是private的 声明他的类内部使用
//        instance.setNo();
    }
}
