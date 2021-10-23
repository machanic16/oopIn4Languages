import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
  Map<String, Map<String,Integer>> typeCarAccepted;
  ArrayList<String> seatsMaterial;
  
  public UberVan(String license, Account driver){
    super(license,driver);
    //this.typeCarAccepted = typeCarAccepted;
    //this.seatsMaterial = seatsMaterial;
    
  }

  @Override
  public void setPassenger(Integer passenger) {
   if(passenger == 6){
      super.passegenger = passenger;
    }else{
      System.out.println("unvalid passenger number, you need 6 passengers");
    }
  }

}
