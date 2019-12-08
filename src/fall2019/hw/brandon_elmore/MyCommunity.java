package fall2019.hw.brandon_elmore;

import com.sun.management.HotSpotDiagnosticMXBean;

import java.util.*;

public class MyCommunity {
    private String name;
    private boolean gated;
    private List<MyHouse> homeowners = new ArrayList();

    public static void main(String[] args) {
        List<MyHouse> houses = new ArrayList<>();
        for( int i = 1; i<10;i++) {
            houses.add(new MyHouse(i , "Boogs Ln" , i * 1500.00 , i%2==0 , new MyHouseStyle() , MyHouse.createRooms(new MyRoom[i+2])));
        }
        MyCommunity One = new MyCommunity("Boogs" , false , new ArrayList<>());
        MyCommunity Two = new MyCommunity();
        System.out.println(One);
        System.out.println(Two);

        System.out.println("Max: " + One.max());
        System.out.println("Min: " + One.min());
        System.out.println("Average: " + One.averageCost());
        System.out.println("Available: " + One.Available());
        System.out.println("Homes:" + One.HomeownersAsoc());
        One.setHomeowners(houses);
        System.out.println("Homes:" + One.HomeownersAsoc());
        System.out.println("Max: " + One.max());
        System.out.println("Min: " + One.min());
        System.out.println("Average: " + One.averageCost());
        System.out.println("Available: " + One.Available());
        System.out.println("Homes:" + One.HomeownersAsoc());
        System.out.println(Two.getName());
        Two.Rename("Homework");
        System.out.println(Two.getName());
        System.out.println(One.isGated());
        One.setGate(true);
        System.out.println(One.isGated());
        System.out.println(One);
    }

    //Default Constructor
    public MyCommunity() {
        this.name = "No name";
        this.gated = false;
        this.homeowners = new ArrayList();
    }

    //Overloaded Constructor
    public MyCommunity(String name , boolean gated , ArrayList<MyHouse> homeowners) {
        this.name = name;
        this.gated = gated;
        this.homeowners = homeowners;
    }

    //Setter
    public void Rename(String name) {
        this.name = name;
    }

    //Setter
    public void setGate(boolean gated) {
        this.gated = gated;
    }

    //Setter
    public void setHomeowners(List<MyHouse> houses) {
        this.homeowners = houses;
    }

    //Getter
    public String getName() {
        return name;
    }

    //Getter
    public boolean isGated() {
        return gated;
    }

    //Getter
    public List<MyHouse> HomeownersAsoc() {
        return homeowners;
    }

    //Average
    public int averageCost() {
        int sum = 0;
        if (homeowners.size()==0) {
            return 0;
        }
        for (MyHouse house : homeowners) {
            sum += house.getPrice();
        }
        sum = sum / homeowners.size();
        return sum;
    }

    //Search
    public int Available() {
        int numHouses = 0;
        for (MyHouse house : homeowners) {
            if (!house.isSold()) {
                numHouses += 1;
            }
        }
        return numHouses;
    }

    //Search price
    public MyHouse priceMatch(double p) {
        for (MyHouse house : homeowners) {
            if (house.getPrice() == p) {
                return house;
            }
        }
        return null;
    }

    //Max
    public MyHouse max() {
        double temp = 0.0;
        for (MyHouse house : homeowners) {
            if (house.getPrice() > temp) {
                temp = house.getPrice();
            }
        }
        return priceMatch(temp);
    }

    //Min
    public MyHouse min() {
        double temp = 1000000000.0;
        for (MyHouse house : homeowners) {
            if (house.getPrice() < temp) {
                temp = house.getPrice();
            }
        }
        return priceMatch(temp);
    }

    //ToString
    public String toString() {
        String s = "Name: " + name + ", number of units: " + (homeowners.size()) + ", Gated: " + gated;
        return s;
    }
}

