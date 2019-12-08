package fall2019.hw.brandon_elmore;

public class MyRoom {

    private int width;
    private int length;
    private int numWindows;


    public static void main(String[] args) {
        MyRoom One = new MyRoom();
        MyRoom Two = new MyRoom(50,50,4);
        System.out.println(One);
        System.out.println(Two);
        System.out.println("lenght: " + One.getLength());
        System.out.println("Width: " + One.getWidth());
        System.out.println("Windows: " + One.getNumWindows());
        One.setLength(100);
        System.out.println("lenght: " + One.getLength());
        One.setWidth(500);
        System.out.println("Width: " + One.getWidth());
        One.setNumWindows(50);
        System.out.println("Windows: " + One.getNumWindows());
    }

    //Default Constructor
    public MyRoom() {
        this.width = 25;
        this.length = 25;
        this.numWindows = 2;
    }

    //Overloaded constructor
    public MyRoom(int width , int length , int numWindows) {
        this.length = Math.abs(length);
        this.numWindows = numWindows;
        this.width = Math.abs(width);

    }

    //Setter
    public void setLength(int length) {
        this.length = length;
    }

    //Setter
    public void setWidth(int width) {
        this.width = width;
    }

    //Setter
    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    }

    //Getter
    public int getLength() {
        return length;
    }

    //Getter
    public int getWidth() {
        return width;
    }

    //Getter
    public int getNumWindows() {
        return numWindows;
    }

    //ToString
    public String toString() {
        String s = "Dimensions: " + length + " x " + width + ", " + numWindows + " windows";
        return s;
    }
}
