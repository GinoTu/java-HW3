package hw3;

public class p47 
{
	public static void main (String[] args)
	{
		Carp47 car1;
		car1 = new Carp47();
		car1.show();
		
		int number = 1234;
		double gas = 20.5;
		String str = "1號車";
		
		car1.setCar(number, gas);
		car1.setName(str);
				
		car1.show();
	
	}
}

class Carp47
{
	private int num;
	private double gas;
	private String name;
	
	public Carp47()
	{
		num = 0;
		gas = 0.0;
		name = "沒有名稱";
		System.out.println("生產了車子");
	}
	
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("車號設為 " + num + "汽油量設為" + gas);
	}
	
	public void setName(String nm)
	{
		name = nm;
		System.out.println("將車名設為 " + name);
	}
	
	void show()
	{
		System.out.println("Car number is " + this.num);
		System.out.println("volume of gas is " + this.gas);
		System.out.println("車名是" + this.name);
	}
	
}


















