package entities;

public class BusinessAccount extends Account{
    
    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    //O super é utilizado para receber os dados passados na classe Account
    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    //construtor que calcula o valor final depois do emprestimo
    public void loan(double ammount) {
        if (ammount <= loanLimit){
            balance += ammount - 10.0;
        }
    }
    
    @Override
    public void withdraw(double ammount) {
        super.withdraw(ammount);
        balance -= 2.0;
    }
}
