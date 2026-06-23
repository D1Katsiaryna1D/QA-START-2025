package org.prog.session5;

import java.util.*;

//TODO: write Map with car owners as keys and owned cars as values
//TODO: assign each car random color using randomColor() from this class

public class MapDemo {

    public static void main(String[] args) {
        // tax id, each tax id can have 1-5 FOPs
        Map<String, List<String>> map = new HashMap<>();
        map.put("17253761525", new ArrayList<>());

        map.get("17253761525").add("FOP #1");
        map.get("17253761525").add("FOP #2");
        map.get("17253761525").add("FOP #3");
        map.get("17253761525").add("FOP #4");

        List<String> list1 = map.get("17253761525");

        for (String someString : list1) {
            System.out.println("Citizen 17253761525 has : " + someString);

            Map<String, List<String>> cars = new HashMap<>();
            cars.put ("Dania", new ArrayList<>());
            cars.put ("Sasha", new ArrayList<>());
            cars.put ("Katia", new ArrayList<>());
            cars.put ("Kristina", new ArrayList<>());

            cars.get("Dania").add("Car #2");
            cars.get("Sasha").add("Car #1");
            cars.get("Katia").add("Car #3");
            cars.get("Kristina").add("Car #2");

            for (String owner : cars.keySet()) {
                System.out.println(owner + "owns" + cars.get(owner).size() + "cars");
                for (String oneCar: cars.get(owner)) {
                    System.out.println(oneCar + "color: " + randomColor());
                }
            }
        }
    }

    public static String randomColor() {
            Random random = new Random();
            return switch (random.nextInt(5)) {
                case 0 -> "red";
                case 1 -> "green";
                case 2 -> "blue";
                case 3 -> "yellow";
                case 4 -> "pink";
                default -> "black";

            };
        }
    }


