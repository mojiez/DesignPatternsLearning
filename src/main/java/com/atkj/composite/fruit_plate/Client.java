package com.atkj.composite.fruit_plate;

public class Client {
    // 吃水果
    // 对象
    // 1. 抽象构件
    // 2. 容器构件
    // 3. 叶子构件
    public static void main(String[] args) {
        fruitPlate fruitPlate1 = new fruitPlate();
        fruitPlate fruitPlate2 = new fruitPlate();

        fruitPlate1.add(new fruit());
        fruitPlate2.add(new fruit());
//        fruitPlate1.add(fruitPlate2);
        fruitPlate1.eat();
    }
}
