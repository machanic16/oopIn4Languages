class Card extends Payment() {
  constructor(number, cvv, expDate, owner) {
    this.number = number;
    this.cvv = cvv;
    this.expDate = expDate;
    this.owner = owner;
  }
}
