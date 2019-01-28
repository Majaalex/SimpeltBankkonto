public class SavingsAccount extends Account {
    private double totalInterest;

    public SavingsAccount(String owner, long account, double initial){
        super(owner, account, initial);
        setOwner(owner);
        setAccountNum(account);
        setBalance(initial);
        setAccountType(2);
    }

    public double getTotalInterest(){
        return totalInterest;
    }

    @Override
    public void addInterest() {
        double interest = 0.1;
        double newBalance = getBalance() * interest;
        setBalance(newBalance);
        double addedInterest = newBalance - getBalance();
        totalInterest = totalInterest + addedInterest;
    }
}