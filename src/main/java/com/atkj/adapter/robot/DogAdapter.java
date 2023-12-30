package com.atkj.adapter.robot;

public class DogAdapter extends Dog implements Robot  {
    // 适配器类


    public void cry() {
        System.out.println("机器人模仿：");
        super.wang();
    }

    public void move() {
        System.out.println("机器人模仿：");
        super.run();
    }

}
