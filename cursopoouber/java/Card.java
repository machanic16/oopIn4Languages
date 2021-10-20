class Card extends Payment{
  Integer number;
  Integer cvv;
  String expirationDate;
  String owner;
  
  public Card(Integer number,Integer cvv, String expirationDate, String owner){
    this.number = number;
    this.cvv = cvv;
    this.expirationDate = expirationDate;
    this.owner = owner;
  }
}