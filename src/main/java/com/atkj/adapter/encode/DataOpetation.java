package com.atkj.adapter.encode;

public abstract class DataOpetation {
    private String password;
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }
    public abstract String doEncrypt(int key,String ps);
}
