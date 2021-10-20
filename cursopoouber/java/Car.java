class Car{
  Integer id;
  String  license;
  Account  driver;
  private Integer passegenger;

  public Car(String license, Account driver){
    this.license = license;
    this.driver = driver;
    
  }

  void printDataCar(){
    if(passegenger != null){
      System.out.println("License: " + license + "Name Driver: " + driver.name + " Passengers: " + passegenger);
    }else{
      System.out.println("There is empy fields");
    }
  }

  public Integer getPassenger(){
    return passegenger;
  }

  public void setPassenger(Integer passenger){
    if(passenger == 4){
      this.passegenger = passenger;
    }else{
      System.out.println("unvalid passenger number, you need 4 passengers");
    }
  }

}