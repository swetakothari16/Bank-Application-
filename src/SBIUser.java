import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterFace{

    // attribute
   private String name;
   private String accountNo;
    private double balance;
    private String password;
    private double rateOfInterest;

    @Override
    public double checkBalance() {
        return balance;
    }

    public SBIUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        //bank is initiaizing
        this.rateOfInterest = 6.5;
        this.accountNo = String.valueOf(UUID.randomUUID());

    }

    @Override
    public String addMoney(int amount) {
        balance = balance + amount;
        return "your new balance is:" + balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
        if(Objects.equals(enteredPassword,password)){
            if(amount>balance)
            {
                return "insufficient Money";
            }
            else{
                balance = balance-amount;
                return "paise hi paise";

            }
        }
        else{
            return "Worng password";
        }
    }

    @Override
    public double calculateInterest(int years) {
        return(balance * years * rateOfInterest)/100;
    }
}
