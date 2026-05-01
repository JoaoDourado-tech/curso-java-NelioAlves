package secao13.Aula144.Entities;

public class SavingsAccount extends Account {
    protected Double interestRate;

    public SavingsAccount(){ //Construtor PADRÃO
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += (balance*interestRate);
    }

    @Override //Usado para informar ao Leitor e ao Compilador da Sobreposição abaixo
    public void withdraw(Double amount) {
        balance -= amount;
    } //Sobrescrição do Metodo
    //Busca criar uma nova regra à Função de descontar 5$ do saque, já que em SavingsAccount isso não é cobrado...

}
