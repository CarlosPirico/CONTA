package models;

public class Conta {
	// Declarando os atributos.
	private Double balance = 0.00;
	private Integer checkQtd = 0;
	
	// Metodo privado para mostrar o saldo.
	private Double balance() {
		return this.balance;
	}
	
	// Metodo privado para realizar o deposito e cobrar a taxa.
	private void deposit(Double deposit) throws Exception{
		// Aceitar apenas depositos como valores acima de 0.
		if (deposit < 0) {
			throw new Exception("Deposito não pode ser menor do que zero.");
		}
		this.balance += deposit * 0.99;
	}
	
	// Metodo privado para realizar saques e cobrar taxa.
	private void withdraw(Double withdraw) throws Exception{
		// Aceitar apenas valores positivos.
		if (withdraw < 0) {
			throw new Exception("Saque não aceita valores negativos.");
		}
		this.balance -= withdraw * 1.005;
	}
	
	// Buscar saldo encapsulado.
	public String getBalance() {
		this.checkQtd ++;
		// vericar se houve 5 consultas para cobrar taxa.
		if (this.checkQtd % 5 == 0) {
			this.balance -= 0.10;
		}
		return String.format("Saldo em conta: R$%,.2f", balance());
	}
	
	// Deposito encapsulado.
	public void setDeposit(Double deposit) throws Exception {
		deposit(deposit);
	}
	
	// Saque encapsulado
	public void setWithdraw(Double withdraw) throws Exception {
		withdraw(withdraw);
	}
	
}