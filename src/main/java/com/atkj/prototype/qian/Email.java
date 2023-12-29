package com.atkj.prototype.qian;

public class Email implements Cloneable{
    // Attachment表示附件 这里是成员对象
    private Attachment attachment = null;
    public Email() {
        this.attachment = new Attachment();
    }

    //  使用原型模式实现浅克隆
    public Object clone() {
        Email clone = null;
        try {
            clone = (Email) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone failure!");
        }
        return clone;
    }
    public Attachment getAttachment() {
        return this.attachment;
    }
    public void display() {
        System.out.println("查看邮件");
    }
}
