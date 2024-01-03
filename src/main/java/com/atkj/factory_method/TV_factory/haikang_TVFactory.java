package com.atkj.factory_method.TV_factory;

public class haikang_TVFactory extends TVFactory{
    @Override
    public TV getTV() {
        return new haikang_TV();
    }
}
