package org.prog.session3.phones;

public class IPhone extends Phone implements ICamera {

    @Override
    public void call(String subscriber){
        System.out.println("Iphone calling " + subscriber);
    }
    @Override
    public void takePhoto() {
        System.out.println("Iphone takes photo");
    }
}
