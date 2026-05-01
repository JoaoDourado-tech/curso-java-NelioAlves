package secao13.Aula144.Entities;

public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount() {
        super(); //Executa a lógica do Construtor da Superclasse
    }

    public BusinessAccount(Integer number,String holder,Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount){
        if (loanLimit >= amount){
            deposit(amount);
        }
    }

    public void withdraw(Double amount) {
        super.withdraw(amount); //Super. permite acessar a superclasse diretamente
        balance -= 2.0;
    }
}
