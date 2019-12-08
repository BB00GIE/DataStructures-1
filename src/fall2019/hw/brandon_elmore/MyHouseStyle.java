package fall2019.hw.brandon_elmore;

public class MyHouseStyle {

    private String style;
    private int floors;
    private boolean security;

    public  static void main(String[] args) {
        MyHouseStyle One = new MyHouseStyle();
        System.out.println(One);
        One.setFloors(4);
        One.setSecurity(true);
        One.setStyle("Tudor");
        System.out.println(One);
        System.out.println(One.getFloors());
        System.out.println(One.getStyle());
        System.out.println(One.isSecure());
    }

    //Default Constructor
    public MyHouseStyle() {
        floors = 1;
        security = false;
        style = "Goth";
    }

    //Overloaded Constructor
    public MyHouseStyle(int floors , boolean security , String style) {
        this.floors = floors;
        this.security = security;
        this.style = style;
    }

    //Setter
    public void setFloors(int floors) {
        this.floors = floors;
    }

    //Setter
    public void setSecurity(boolean security) {
        this.security = security;
    }

    //Setter
    public void setStyle(String style) {
        this.style = style;
    }

    //Getter
    public int getFloors() {
        return floors;
    }

    //Getter
    public boolean isSecure() {
        return security;
    }

    //Getter
    public String getStyle() {
        return style;
    }

    //ToString
    public String toString() {
        String s = "Style : " + style + ", number of Floors: " + floors + ", Security: " + security;
        return s;
    }
}