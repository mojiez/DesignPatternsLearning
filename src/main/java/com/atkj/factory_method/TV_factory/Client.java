package com.atkj.factory_method.TV_factory;
// 工厂方法模式 和 简单工厂模式的区别就是
// 工厂方法的工厂是抽象的  简单工厂的工厂是具体的
public class Client {
    public static void main(String[] args) {
        TV tv1 = new haikang_TVFactory().getTV();
        TV tv2 = new TCL_TVFactory().getTV();
        System.out.println("haikang");
        tv1.play();
        System.out.println("TCL");
        tv2.play();
    }
}
