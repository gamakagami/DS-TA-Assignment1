public class Car{
    private String name;
    private int yom;
    private int maxspeed;
    Car(String name, int yom, int maxspeed){
        this.name = name;
        this.yom = yom;
        this.maxspeed = maxspeed;
    }

    public void name(){
        System.out.println( "Name:"+name);
    }
    public void year(){
        System.out.println("Year of Make:"+yom);
    }
    public void maxspeed(){
        System.out.println("Max Speed:"+maxspeed);
    }
    public static void main(String[] args){
        Car MyCar = new Car("Duck Car", 1999, 10);

        MyCar.name();
        MyCar.year();
        MyCar.maxspeed();
    }
}
