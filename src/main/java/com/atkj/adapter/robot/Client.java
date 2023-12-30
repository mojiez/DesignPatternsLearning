package com.atkj.adapter.robot;

public class Client {
    public static void main(String[] args) {
        Robot dogRobot = new DogAdapter();
        dogRobot.cry();
        dogRobot.move();
    }

}
