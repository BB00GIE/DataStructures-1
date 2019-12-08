package fall2019.hw.brandon_elmore;

public class MyHouse {
    private String street;
    private int numPeople;
    private double price;
    private boolean sold;
    private MyHouseStyle Style;
    private MyRoom[] rooms;


    public static void main(String[] args) {
        MyHouse One = new MyHouse();
        MyHouse Two = new MyHouse(5,"OverLoaded Constructor ln",1500.00,true,new MyHouseStyle(),createRooms(new MyRoom[5]));
        System.out.println(One);
        System.out.println(Two);
        System.out.println("Price: " + One.getPrice());
        System.out.println("People: " + One.getNumPeople());
        System.out.println("Rooms: " + One.getRooms());
        System.out.println("Street: " + One.getStreet());
        System.out.println(One.getStyle());
        System.out.println("Sold: " + One.isSold());
        One.setPrice(2500.00);
        System.out.println(One.getPrice());
        One.setRooms( new MyRoom[9]);
        System.out.println("Rooms: " + One.getRooms());
        One.setStreet("Setter method rd");
        System.out.println(One.getStreet());
        One.setStyle(new MyHouseStyle(5,true,"Tudor"));
        System.out.println(One.getStyle());
        One.setNumPeople(6);
        System.out.println("People: " + One.getNumPeople());
        One.setSold(true);
        System.out.println("Sold: " + One.isSold());
        System.out.println(One);
    }

    //Default Constructor
    public MyHouse() {
        this.numPeople = 0;
        this.price = 100000.00;
        this.street = "Homework BLVD";
        this.Style = new MyHouseStyle();
        this.sold = false;
        this.rooms = new MyRoom[5];
        createRooms(rooms);
    }

    //Overridden Constructor
    public MyHouse(int numPeople , String street , double price , boolean sold , MyHouseStyle Style , MyRoom[] rooms) {
        this.numPeople = numPeople;
        this.street = street;
        this.price = price;
        this.sold = sold;
        this.Style = Style;
        this.rooms = rooms;
    }

    //Setter
    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }

    public static MyRoom[] createRooms(MyRoom[] r ){
        for (int i = 0; i<r.length;i++){
            r[i] = new MyRoom();
        }
        return r;
    }

    //Setter
    public void setStreet(String street) {
        this.street = street;
    }

    //Setter
    public void setPrice(double p) {
        this.price = p;
    }

    //Setter
    public void setSold(boolean sold) {
        this.sold = false;
    }

    //Setter
    public void setStyle(MyHouseStyle style) {
        this.Style = style;
    }

    //Setter
    public void setRooms(MyRoom[] rooms) {
        this.rooms = rooms;
    }

    //Getter
    public String getStreet() {
        return street;
    }

    //Getter
    public double getPrice() {
        return price;
    }

    //Getter
    public boolean isSold() {
        return sold;
    }

    //Getter
    public MyHouseStyle getStyle() {
        return Style;
    }

    //Getter
    public int getNumPeople() {
        return numPeople;
    }

    //Getter
    public int getRooms() {
        return rooms.length;
    }

    //ToString
    public String toString() {
        String s = "Street: " + street + " , Bedrooms: " + (numPeople - 1) + " , Cost: $" + price;
        return s;
    }
}

