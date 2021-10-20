class Main {
  public static void main(String[] args){
    UberX uberx1 = new UberX("AMQ123",new Driver("Andres Herrera", "AND123","D@gmail.com"),"Audi", "TT");
    uberx1.setPassenger(4); 
    uberx1.printDataCar();
    System.out.println(uberx1.driver.email);
    System.out.println(uberx1.brand + " " + uberx1.model);
    //System.out.println("Car License: " + car.license);

    /*Car car2 = new Car("QWE567", new Driver("Andrea Herrera", "HER678S", "d3@gmail.com"));
    car2.passegenger = 3;
    car2.printDataCar();
    System.out.println(car2.driver.email);
    */
    //System.out.println("Car License: " + car2.license);
  }
}