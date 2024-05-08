public class User {
    private String name;
    private String agencyNumber;
    private int accountNumber;
    private double currency;

    public User(String name, String agencyNumber, int accountNumber, double currency) {
        this.name = name;
        this.agencyNumber = agencyNumber;
        this.accountNumber = accountNumber;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public String getAgencyNumber() {
        return agencyNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Olá " + name + ", obrigado por criar uma conta no nosso banco, sua agência é " + agencyNumber +
                ", conta " + accountNumber +
                " e seu saldo R$" + currency + "já está disponivel.";
    }
}


