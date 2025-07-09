// Save as TransactionSimulation.java
import java.util.*;

class Account {
    int id;
    String name;
    int balance;

    Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Balance: Rs" + balance;
    }
}

public class TransactionSimulation {
    private List<Account> accounts = new ArrayList<>();

    public TransactionSimulation() {
        // Krishna: ID 1, Rama: ID 2
        accounts.add(new Account(1, "Krishna", 3000));
        accounts.add(new Account(2, "Rama", 1500));
    }

    // Transfer with rollback
    public void transfer(int fromId, int toId, int amount) {
        System.out.println("\nTransferring Rs" + amount + " from Account ID " + fromId + " to Account ID " + toId);

        // Backup state for rollback
        List<Account> backup = new ArrayList<>();
        for (Account a : accounts) {
            backup.add(new Account(a.id, a.name, a.balance)); // deep copy
        }

        try {
            Account from = findAccount(fromId);
            Account to = findAccount(toId);

            if (from == null || to == null) throw new Exception("Invalid account ID");
            if (from.balance < amount) throw new Exception("Insufficient balance");

            from.balance -= amount;
            to.balance += amount;

            System.out.println(" Transfer successful.");
        } catch (Exception e) {
            System.out.println(" Transaction failed: " + e.getMessage());
            accounts = backup; // rollback
            System.out.println(" Rolled back to previous state.");
        }

        showAllAccounts();
    }

    // Find account by ID
    private Account findAccount(int id) {
        for (Account a : accounts) {
            if (a.id == id) return a;
        }
        return null;
    }

    // Display accounts
    public void showAllAccounts() {
        System.out.println("\n Current Account Balances:");
        for (Account a : accounts) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        TransactionSimulation bank = new TransactionSimulation();

        bank.showAllAccounts();

        // Valid transfer: Krishna -> Rama
        bank.transfer(1, 2, 1000);

        // Invalid: Rama doesn't have enough to send
        bank.transfer(2, 1, 5000);

        // Invalid: Wrong account ID
        bank.transfer(1, 99, 200);
    }
}
