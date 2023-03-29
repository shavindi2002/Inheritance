public class Vehicle {
    void drive(){
        System.out.println("Driving!");
    }
    void vehicleBreak(){
        System.out.println("Break!");
    }
    void reverse(){
        System.out.println("reverse!");
    }
}
class Car extends Vehicle{
    void motorRasing(){
        System.out.println("Racing!");
    }
}
class ModernCar extends Car{
    void flying(){
        System.out.println("flying!");
    }
}
class Boat extends Vehicle{
    void surf(){
        System.out.println("surfing!");
    }
}
class ModernBoat extends Boat{
    void landRidding(){
        System.out.println("Ridding!");
    }
}
class TestOutput{
    public static void main(String[] args) {
        ModernCar mc = new ModernCar();
        ModernBoat mb = new ModernBoat();
        mc.drive();
        mc.vehicleBreak();
        mc.reverse();
        mc.motorRasing();
        mc.flying();
        mb.drive();
        mb.vehicleBreak();
        mb.reverse();
        mb.surf();
        mb.landRidding();
    }
}
