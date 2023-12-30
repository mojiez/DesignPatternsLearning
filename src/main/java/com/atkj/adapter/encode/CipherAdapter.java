package com.atkj.adapter.encode;

public class CipherAdapter extends DataOpetation{
    private Caesar caesar;
    public CipherAdapter() {
        caesar = new Caesar();
    }

    public String doEncrypt(int key,String ps) {
        return caesar.doEncrypt(key,ps);
    }
}
