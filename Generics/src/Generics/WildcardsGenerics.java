package Generics;

import java.util.ArrayList;
import java.util.List;

class Vehicle{
    private int vehicleNum;

    public Vehicle(int vehicleNum) {
        this.vehicleNum = vehicleNum;
    }

    public int getVehicleNum() {
        return vehicleNum;
    }

    @Override
    public String toString() {
        return "vehicleNum=" + vehicleNum;
    }
    void info(){
        System.out.println("info from vehicle");
    }
}
class Car extends Vehicle{
    private String carModel;

    public Car(int vehicleNum, String carModel) {
        super(vehicleNum);
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }

    @Override
    public String toString() {
        return "carModel='" + carModel ;
    }
    @Override
    void info(){
        System.out.println("info from car");
    }
}
public class WildcardsGenerics {

    public static void main(String[] args) {

        List<Vehicle> list=new ArrayList<>();
        list.add(new Vehicle(1));
        list.add(new Vehicle(2));
        list.add(new Vehicle(3));
        list.add(new Vehicle(4));
        list.add(new Car(5,"audi"));
        list.add(new Car(6,"bmw"));
        list.add(new Car(7,"benz"));
        //list.add(new Object());
        new WildcardsGenerics().printList(list);


    }
    void printList(List<? extends Vehicle> list){
        for (Vehicle o:list){
            o.info();
        }
    }
}

/*
<? super car> -->lowerLimit[only car and above are allowed ]
<? extends Vehicle> -->upperLimit[only vehicle and below are allowed ]
<?> --> wildcard [can  accept anything]

 */