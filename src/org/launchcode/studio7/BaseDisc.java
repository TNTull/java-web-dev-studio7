package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {

    private String name;
    private int storageCapacity;
    private int remainingCapacity;
    private int usedCapacity;
    private ArrayList<String> contents;

    public BaseDisc(String name, int storageCapacity, int usedCapacity, int remainingCapacity) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.usedCapacity = usedCapacity;
        this.remainingCapacity = storageCapacity-usedCapacity;
    }

}
