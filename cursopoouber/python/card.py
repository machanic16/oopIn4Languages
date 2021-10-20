from payment import Payment

class Card(Payment):
   number = int
   cvv = int
   expDate = str
   owner = str

  def __init__(self, number, cvv, expDate, owner):
    super().__init__()
    self.number = number
    self.cvv = cvv
    self.expDate = expDate
    self.owner = owner