package com.atkj.abstract_factory.tool_factory;

public class Haier_Factory extends EFactory{
    @Override
    public Con getCon() {
        return new Haier_Con();
    }

    @Override
    public TV getTV() {
        return new Haier_TV();
    }
}
