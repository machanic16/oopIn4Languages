class Main {
  public static void main(String[] args){
    System.out.println("Hola Mundo");
    Car car = new Car();
    car.license = "AMQ123";
    car.driver = "Andres Herrera";
    car.passegenger = 4;
    System.out.println("Car License: " + car.license);

    Car car2 = new Car();
    car2.license = "QWE567";
    car2.driver = "Andrea Herrera";
    car2.passegenger = 3;
    System.out.println("Car License: " + car2.license);
  }
}