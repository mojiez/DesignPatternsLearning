package com.atkj.prototype.qian;

public class Client {
    public static void main(String[] args) {
        Email email,copy_email;
        email = new Email();
        copy_email = (Email) email.clone();
        System.out.println(email == copy_email);
        //false 两个拷贝是不一样的
        System.out.println(email.getAttachment() == copy_email.getAttachment());
        // true 对象成员是一样的 浅克隆 （默认的clone）
    }
}
