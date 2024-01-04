package com.atkj.abstract_factory.tool_factory;

public class TCL_Factory extends EFactory{
    @Override
    public TV getTV() {
        return new TCL_TV();
    }

    @Override
    public Con getCon() {
        return new TCL_Con();
    }
}
