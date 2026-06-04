package org.prog.session3.poly;

//TODO: write overloaded drive to to contain:
//TODO: - amount of passengers  def: 0
//TODO: - is payment for gas split def: no

public class Mazda implements ICar {

    public void driveTo(String destination) {
        driveTo(destination, "here and now");
    }

    public void driveTo(String destination, String from) {
        driveTo(destination, from, "nowhere");
    }

    public void driveTo(String destination, String from, String stoppingAt) {
        System.out.println("Mazda drives from " + from + " to " + destination);
        System.out.println("Mazda stopping at " + stoppingAt);
    }

    public void manualGearSwitch(int gear) {
        System.out.println("Switch to " + gear);
    }

    @Override
    public void turn(String direction) {
        System.out.println("Mazda turns " + direction);
    }

    @Override
    public void accelerate() {
        System.out.println("Mazda accelerates");
    }

    @Override
    public void brake() {
        System.out.println("Mazda brakes");
    }


    public void driveTo (String destination, String from, String stoppingAt,int passengers, boolean splitGaz){
        System.out.println("Mazda drive from" + stoppingAt + "to" + destination);
        System.out.println("Number of passengers " + passengers + from);
        if (splitGaz) {
            int payment = 8;
            System.out.println("Passengers pay" + payment + "usd");
            System.out.println("Number of passengers" + passengers * payment + "usd");
            }
    }
}
