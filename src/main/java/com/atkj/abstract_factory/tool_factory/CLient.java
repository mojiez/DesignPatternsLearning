package com.atkj.abstract_factory.tool_factory;

/**
 * 一个电器工厂可以生产多种电器
 * 海尔电器工厂可以生产 海尔电视机和 海尔空调
 * TCL电器工厂可以生产 TCL电视机和 TCL空调
 */
public class CLient {
    public static void main(String[] args) {
        System.out.println("Haier");
        EFactory Hfactory = new Haier_Factory();
        Hfactory.getTV().play();
        Hfactory.getCon().play();

        System.out.println("TCL");
        EFactory Tfactory = new TCL_Factory();
        Tfactory.getTV().play();
        Tfactory.getCon().play();
    }
}
