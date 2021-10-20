from car import Car
from account import Account
from driver import Driver
if __name__ == "__main__":
  print('Hola mundo')

  car = Car( "AMS234", Driver("Andres Herrera", "HER890", "lacra@gmail.com")) 
  print(vars(car))
  print(car.driver.email)

  car2 = Car("QWE567", Driver("Martha", "MAR123", "lacrita@gmail.com")) 
  print(vars(car2))
  print(car2.driver.email)