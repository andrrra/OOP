public interface Account {
    public int balance(); // return balance in account
    // deposit money. Return true on success, or false on failure.
    public boolean deposit(int d); 
    // withdraw money. Return true on success, or false on failure.
    public boolean withdraw(int d);
}
