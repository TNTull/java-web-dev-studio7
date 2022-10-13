//Teresa Tull worked on this on 10-6-2022 ch 8 studio finished in class
package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public CD(String name, int storageCapacity, int usedCapacity) {
        super(name, storageCapacity, usedCapacity);
    }

    @Override
    public void giveError() {
        System.out.println("There was an error burning this disc. The disc might no longer be usable.");
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("Would you like to play a game?");
    }

    @Override
    public void saveData() {

    }

}
