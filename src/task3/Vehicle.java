package task3;

public class Vehicle {
    private double price;
    private double speed;
    private int year;

    public Vehicle(double price, double speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Price: " + price + "$");
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Year: " + year);
    }
}

    class Plane extends Vehicle {
        private double altitude;
        private int passengers;

        public Plane(double price, double speed, int year, double altitude, int passengers) {
            super(price, speed, year);
            this.altitude = altitude;
            this.passengers = passengers;
        }

        public void displayInfo() {
            super.displayInfo();
            System.out.println("Altitude: " + altitude + " meters");
            System.out.println("Number of passengers: " + passengers);
        }
    }

    class Car extends Vehicle {
        private int numberOfDoors;

        public Car(double price, double speed, int year, int numberOfDoors) {
            super(price, speed, year);
            this.numberOfDoors = numberOfDoors;
        }

        public void displayInfo() {
            super.displayInfo();
            System.out.println("Number of doors: " + numberOfDoors);
        }
    }

    class Ship extends Vehicle {
        private int passengers;
        private String homePort;

        public Ship(double price, double speed, int year, int passengers, String homePort) {
            super(price, speed, year);
            this.passengers = passengers;
            this.homePort = homePort;
        }

        public void displayInfo() {
            super.displayInfo();
            System.out.println("Home Port : " + homePort);
            System.out.println("Number of passengers: " + passengers);
        }
    }

  class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(1000000, 900, 2020, 300, 500);
        Car car = new Car(78000, 120, 2023, 4);
        Ship ship = new Ship(200000, 40, 2018, 2000, "Odessa");

        System.out.println("Plane: ");
        plane.displayInfo();
        System.out.println();

        System.out.println("Car: ");
        car.displayInfo();
        System.out.println();

        System.out.println("Ship: ");
        ship.displayInfo();
        System.out.println();
    }
}