package com.atkj.state.forum;

public class Client {
    public static void main(String[] args) {
        ForumAccount account = new ForumAccount("zhangsan");
        System.out.println(account.getState().stateName);
        account.wirteNote();
        account.accountshengji();
        System.out.println(account.getState().stateName);
        // 子类可以继承父类的字段/方法 包括公有 保护 子类还会隐式继承父类的构造函数

        // AbstractState state = new primaryState(); 和 primaryState state1 = new primaryState();有什么区别
//        primaryState state1 = new primaryState();
//        state.aa = 10;
    }
}
