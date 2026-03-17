package com.inheritance;
class Wahan {
    Wahan() {
        System.out.println("Vehicle is created");
    }
    Wahan(String type) {
        System.out.println("Vehicle type: " + type);
    }
}

class NewWahan extends Wahan {
    NewWahan() {
        System.out.println("Car is created");
    }
    NewWahan(String model) {
        super("Four Wheeler");
        System.out.println("Car model: " + model);
    }
}
public class Test {
    public static void main(String[] args) {
    	NewWahan c1 = new NewWahan();
    	NewWahan c2 = new NewWahan("Super Car");
    }
}

