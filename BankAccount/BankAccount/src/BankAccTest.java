public class BankAccTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(500, 500);
        account1.deposit("savings", 500);
        System.out.println(account1.getAccountNum());
        account1.showAllBalance();
    }
}
