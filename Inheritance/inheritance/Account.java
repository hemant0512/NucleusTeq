package inheritance;
public class Account 
{
	private long accountNo;
	private String name;
	private String address;
	private long phoneNo;
	private String dob;
	private long balance;
	

	 /*Account(long )
	 {
		
	 }*/
	
	public void setAccountNo(long accountNo)
	{
		this.accountNo=accountNo;
	}
	public long getAccountNo()
	{
		return accountNo;
	}
	
	
	public void setName(String Name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	
	 
	public void setPhoneNo(long phoneNo)
	{
		this.phoneNo=phoneNo;
	}
	public long getPhoneNo()
	{
		return phoneNo;
	}
	
	
	public void setDob(String dob)
	{
		this.dob=dob;
	}
	public String getDob()
	{
		return dob;
	}
	
	
	public void setBalance(long balance)
	{
		this.balance=balance;
	}
	public long getBalance()
	{
		return balance;
	}
	
	
	public void closeAccount()
	{
		System.out.println("Account closed");	
	}
}