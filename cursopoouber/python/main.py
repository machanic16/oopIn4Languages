from car import Car
from account import Account
if __name__ == "__main__":
  print('Hola mundo')

  car = Car( "AMS234", Account("Andres Herrera", "HER890")) 
  print(vars(car))

  car2 = Car("QWE567", Account("Martha", "MAR123")) 
  print(vars(car2))