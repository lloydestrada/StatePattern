public class ClosedState implements AccountState {
    private Account account;

    public ClosedState(Account account) {
        this.account = account;
    }
    @Override
    public void deposit(double amount) {
        System.out.println("You cannot deposit on a closed account!");
        System.out.println(account.toString());
        System.out.println();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("You cannot withdraw from a closed account!");
        System.out.println(account.toString());
        System.out.println();
    }

    @Override
    public void suspend(Account account) {
        System.out.println("You cannot suspend a closed account!");
    }

    @Override
    public void activate(Account account) {
        System.out.println("You cannot activate a closed account!");
    }

    @Override
    public void close(Account account) {
        System.out.println("Account is already closed!");
    }
}