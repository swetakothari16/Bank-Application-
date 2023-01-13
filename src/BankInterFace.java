public interface BankInterFace {
    double checkBalance();
    String addMoney(int amount);
    String withdrawMoney(int amount,String paasword);
    double calculateInterest(int years);
}
