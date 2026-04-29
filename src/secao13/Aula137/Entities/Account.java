package secao13.Aula137.Entities;

public class Account {
    private Integer number;
    private String holder;
    protected Double balance; //Permite que ele seja acessado por todas as Classes dentro do MESMO PACOTE
    public Account(Integer number, String holder, Double balance) {
    }

    public Account(Integer number, Double balance, String holder) {
        this.number = number;
        this.balance = balance;
        this.holder = holder;
    }

    public Account() {
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    //Set Balance não pode ser criado para não se alterar o saldo livremente...

    public void withdraw(Double amount) {
        balance -= amount+5;
    }
    public void deposit(Double amount) {
        balance += amount;
    }
}
