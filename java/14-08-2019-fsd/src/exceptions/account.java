package exceptions;
import java.io.Serializable;
public class account implements Serializable{
private double amount;
private String accNumber;

public account() {
	super();
}
public account( String accNumber, double amount) {
	super();
	this.amount = amount;
	this.accNumber = accNumber;
}
public void setamount(double amount)
{
	this.amount=amount;
}

@Override
public String toString() {
	return "account [amount=" + amount + ", accNumber=" + accNumber + "]";
}
public account createaccount(String accNumber,double amount)throws AccountNotValiddException
{
	this.accNumber=accNumber;
	this.amount=amount;
	if(amount<500)
	{
		throw new AccountNotValiddException("NOT VALID AMOUNT");
	}
	else
	{
		System.out.println(this.toString());
	}
	return new account(accNumber,amount);
}
public void check(Object o1) throws AccountNotValiddException
{
	account o=(account)o1;
	if(o.accNumber==this.accNumber)
	{
		throw new AccountNotValiddException("account number already exists");
		
	}
	else
	{   
		this.createaccount(this.accNumber,this.amount);
	}
}
}
