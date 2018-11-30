package prog3.employeeinfo;

class Account {
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "Account type: " + acctType.toString().toLowerCase() + 
			"\nCurrent bal: " + balance + "\n";
	}

	public void makeDeposit(double deposit) {
		balance = balance + deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if (amount > balance) {
			return false;	
		}
		balance = balance - amount;
		return true;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public AccountType getAccountType() {
		return acctType;
	}
}