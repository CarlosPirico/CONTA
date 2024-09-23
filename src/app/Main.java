package app;
import models.Conta;

public class Main {

	public static void main(String[] args) throws Exception{
		try {
			// Estanciando uma nova conta com os dados zerados.
			Conta conta1 = new Conta();
			// Realizando depositos e saques e consultando o saldo a cada ação.
			System.out.println(conta1.getBalance());
			conta1.setDeposit(10.0);			
			System.out.println(conta1.getBalance());
			conta1.setDeposit(22.0);
			System.out.println(conta1.getBalance());
			conta1.setWithdraw(5.0);
			System.out.println(conta1.getBalance());
			conta1.setWithdraw(3.3);
			System.out.println(conta1.getBalance());
		} catch (Exception e) {
			// retornando o erro personalizado.
			System.out.println(e.getMessage());
		}
	}
}
