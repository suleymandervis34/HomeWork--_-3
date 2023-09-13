
public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println("Создан новый счет.Денег на счету " + bankAccount.getAmount());
        bankAccount.deposit(15000);
        System.out.println("Успешно пополнено.Денег на счету " + bankAccount.getAmount());
        while (true) {
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException money) {
                System.out.println(money.getMessage() + money.getRemainingAmount());
                try {
                    bankAccount.withDraw(((int) bankAccount.getAmount()));
                } catch (LimitException cash) {
                    cash.printStackTrace();
                }
                break;
            }
        }
    }
}