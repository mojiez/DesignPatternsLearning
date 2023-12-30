package com.atkj.adapter.encode;

// Caesar类是第三方提供的数据加密类
// 定义为final类 无法继承 那么不能通过类适配器来实现 只能通过对象适配器实现

public final class Caesar {
    public String doEncrypt(int key, String ps) {
        String es = "";
        es = ps;
        return es;
    }
}
