package com.atkj.composite.fruit_plate;

import java.util.ArrayList;
import java.util.Arrays;

// 容器构件
public class fruitPlate extends Component{
    private ArrayList<Component> componentList = new ArrayList<>();
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    public void eat() {
        for (Component obj:componentList) {
            obj.eat();
        }
    }
}
