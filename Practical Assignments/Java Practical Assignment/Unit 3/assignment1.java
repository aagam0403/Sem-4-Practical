class MotorVehicle
{
    String ModelName;
    String ModelNumber;
    int ModelPrice;
    public MotorVehicle(String ModelName, String ModelNumber, int ModelPrice)
    {
        this.ModelName=ModelName;
        this.ModelNumber=ModelNumber;
        this.ModelPrice=ModelPrice;
    }
    public void display()
    {
        System.out.println("Model Name: " + ModelName);
        System.out.println("Model Number: " + ModelNumber);
        System.out.println("Model Price: " + ModelPrice);
    }
}
class Car extends MotorVehicle
{
    int ModelDiscount;
    public Car(String ModelName, String ModelNumber, int ModelPrice, int ModelDiscount)
    {
        super(ModelName, ModelNumber, ModelPrice);
        this.ModelDiscount=ModelDiscount;
    }
    public void display1()
    {
        super.display();
        System.out.println("Discount Rate: " + ModelDiscount + "%");
        double discountedPrice = ModelPrice - (ModelPrice * ModelDiscount / 100);
        System.out.println("Price after Discount: " + discountedPrice);
    }
}
public class assignment1
{
    public static void main(String args[])
    {
        Car car1 = new Car("Honda Jazz", "HZ2024", 25000, 10);
        car1.display1();
    }
}