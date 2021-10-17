class Main {
  public static void main(String[] args){
    System.out.println("Hola Mundo");
    Car car = new Car("AMQ123",new Account("Andres Herrera", "AND123"));
    car.passegenger = 4;
    car.printDataCar();
    //System.out.println("Car License: " + car.license);

    Car car2 = new Car("QWE567", new Account("Andrea Herrera", "HER678S"));
    car2.passegenger = 3;
    car2.printDataCar();
    //System.out.println("Car License: " + car2.license);
  }
}