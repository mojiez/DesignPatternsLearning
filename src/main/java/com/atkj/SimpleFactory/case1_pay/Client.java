package com.atkj.SimpleFactory.case1_pay;

public class Client {
    // 销售管理系统支持多种支付方式，如现金支付 信用卡支付 代金券支付
    // 如果不使用简单工厂 可能会出现下面的代码：
    /*
    public void pay(String type) {
        if (type.equals("cash")){

        }else if (type.equals("credit")) {

        }else {

        }
    }
    */
    // 通过使用简单工厂 可以对原有的代码进行改进
    public static void main(String[] args) {
        AbstractPay pay_1 = PayMethodFactory.getPayMethod("cash");
        AbstractPay pay_2 = PayMethodFactory.getPayMethod("credit");
        System.out.println("cash pay:");
        pay_1.pay();
        System.out.println("credit pay:");
        pay_2.pay();
    }
}
