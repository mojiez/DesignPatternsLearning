package com.atkj.SimpleFactory.case1_pay;

public class PayMethodFactory {
    public static AbstractPay getPayMethod(String type) {
        if (type.equals("cash")) {
            return new CashPay();
        } else if (type.equals("credit")) {
            return new CreditCardPay();
        } else {
            return null;
        }
    }
}
