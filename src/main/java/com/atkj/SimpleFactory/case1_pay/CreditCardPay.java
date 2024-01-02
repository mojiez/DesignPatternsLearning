package com.atkj.SimpleFactory.case1_pay;

public class CreditCardPay extends AbstractPay{
    public void pay() {
        System.out.println("信用卡支付");
    }
}
