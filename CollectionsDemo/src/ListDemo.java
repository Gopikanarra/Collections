

import java.util.ArrayList;

abstract class Account1{
	String name;
	int accno;
	double balance;
	abstract void checkbalance();
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
}
public class ListDemo extends Account1 {

	ArrayList<ListDemo()> al=new ArrayList<ListDemo>();
	ListDemo(String name, int accno, double balance) {
		this.name=name;
		this.accno=accno;
		this.balance=balance;
		al.add(new ListDemo("john",23333,54221));
		al.add(new ListDemo("tom",74854,45362));
		al.add(new ListDemo("ibraham",34552,45121));
		al.add(new ListDemo(this.name,this.accno,this.balance));
		
}
	public static void main(String[] args) {
		
		ListDemo d=new ListDemo("gopika",233231,34234);
		d.checkbalance();
		d.withdraw(3000);
		d.deposit(50000);
		d.checkbalance();
	}

		void checkbalance() {
			
			System.out.println("balance="+this.balance);
		}
		
		void deposit(double amount) {
			this.balance+=amount;
			
		}
		
		void withdraw(double amount) {
			this.balance-=amount;
			
		}

}

