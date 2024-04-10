package Clase2.Ejercicio2;

public class CurrentAccount extends Account{
    protected float overdraft = 0;

    public CurrentAccount(float balance, float annualRate) {
        super(balance, annualRate);
    }

    public CurrentAccount(float balance, float annualRate, float overdraft) {
        super(balance, annualRate);
        this.overdraft = overdraft;
    }
@Override
    public void withdraw(float amount){
        float newBalance = balance - amount;
        if(newBalance >= 0){
            balance -= amount;
            numberWithdrawals++;
        }else{
            balance = 0;
            overdraft = (balance - amount) * (-1);
        }
    }
@Override
    public void consign(float amount){
        if (overdraft >= 0){
            if (amount == overdraft){
                overdraft = 0;
                numberConsignments++;
            }else if (amount < overdraft){
                overdraft -= amount;
                numberConsignments++;
            }else {
                float aux = overdraft - amount;
                balance += aux * (-1);
                numberConsignments++;
            }

        }else {
            balance += amount;
            numberConsignments++;
        }
    }
    public void print (){
        int totalTransactions = numberConsignments + numberWithdrawals ;
        System.out.println("Saldo: " + this.balance + ".\nComision mensual: " + this.monthlyCommission + ".\nTransacciones realizadas: " + totalTransactions + ".\nSobregiro: " + this.overdraft);
    }
}
