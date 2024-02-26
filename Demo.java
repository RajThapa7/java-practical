class Car{
  String model;
  String engine;

  Car(String model, String engine){
    this.model = model;
    this.engine = engine;
  }

  void getDetails(){
    System.out.println(model+' '+engine);
  }
} 

public class Demo{
  public static void main(String[] args){
    Car myCar = new Car("Honda Civic","200cc");
    myCar.getDetails();
  }
}
