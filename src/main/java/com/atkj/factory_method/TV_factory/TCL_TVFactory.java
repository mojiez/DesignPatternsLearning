package com.atkj.factory_method.TV_factory;

public class TCL_TVFactory extends TVFactory{
    @Override
    public TV getTV() {
        return new TCL_TV();
    }
}
