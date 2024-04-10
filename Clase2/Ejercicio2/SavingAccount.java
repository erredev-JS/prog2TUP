package Clase2.Ejercicio2;

public class SavingAccount extends Account{
    protected boolean able;

    public SavingAccount(float balance, float annualRate) {
        super(balance, annualRate);
    }

    public SavingAccount(float balance, float annualRate, boolean able) {
        super(balance, annualRate);
        if (this.balance < 10000){
            able = false;
        }else {
            able = true;
        }
    }
    public boolean isAble() {
        return able;
    }

    @Override
    public void consign(float amount){
        this.balance += amount;
        numberConsignments++;
            System.out.println("Se han consignado $" + amount);
        if (balance >= 10000){
            able = true;
            System.out.println("Se ha activado su cuenta");
        }

    }
    @Override
    public void withdraw(float amount) {
        float newBalance = balance - amount;
        if (able) {
            if (newBalance >= 0) {
                balance -= amount;
                numberWithdrawals++;
                if (balance < 10000){
                    able = false;
                    System.out.println("Su cuenta de ahorro se ha desactivado");
                }
            } else {
                System.out.println("La cantidad a retirar excede el saldo actual.");
            }
        }else {
            System.out.println("No fue posible retirar dinero, debido a que su cuenta está inactiva");
        }
    }
    @Override
    public void monthlyStatement(){
        if (numberWithdrawals > 4){
            balance -= (numberWithdrawals - 4) *1000;
        }
        if (balance < 10000){
            able = false;
            System.out.println("Su cuenta de ahorro se ha desactivado");
        }
    }
    public void print(){
        int totalTransactions = numberConsignments + numberWithdrawals;
        System.out.println("Saldo: " + this.balance + ".\nComision mensual: " + this.monthlyCommission + ".\nTransacciones realizadas: " + totalTransactions);
    }
}
