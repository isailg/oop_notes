from car import Car
from UberX import UberX
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")
    uberx = UberX("AMS234",Account("AH","AND16"),"Tesla","Cybertruck" )
    print(vars(uberx))
    print(vars(uberx.driver))
