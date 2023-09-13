import javax.naming.LimitExceededException;

public class BankAccount extends LimitExceededException {
    private double amount = 0;

    public double getAmount() {
        return amount;
    }

    public void deposit(int sum) {
        amount = amount + sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (amount < sum) {
            throw new LimitException("Ошибка. Сумма на снятие больше чем денег на счете,на счету ", amount);
        } else {
            amount = amount - sum;
            System.out.println("Успешно снято " + sum + "." + " Всего на счету " + amount);
        }
    }
}