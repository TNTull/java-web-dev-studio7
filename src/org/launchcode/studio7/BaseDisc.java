//Teresa Tull worked on this on 10-6-2022 ch 8 studio finished in class
package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {

    private String name;
    private int storageCapacity;
    private int remainingCapacity;
    private int usedCapacity;
    private ArrayList<String> contents;

    public BaseDisc(String name, int storageCapacity, int usedCapacity) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.usedCapacity = usedCapacity;
        this.remainingCapacity = storageCapacity-usedCapacity;
    }

    public String writeData(int dataSize){
        if (dataSize > remainingCapacity){
            return "Not enough disc space!";
        }
        usedCapacity += dataSize;
        remainingCapacity -= dataSize;

        return "Data written to disc. Remaining space = " + remainingCapacity;
    }

}
