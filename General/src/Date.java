import javax.swing.*;
public class Date {
	private
	int Day;//Question 2
	String month;
	int year;
	public 
	Date()
	{
		Day=1;
		month="Jan";
		year=2000;
	}
	Date(int d,String m,int y)
	{
		Day=d;
		month=m;
		year=y;
	}
	int getDay()
	{
		return Day;
	}
	void setDay(int r)
	{
		Day=r;
	}
	String getmonth()
	{
		return month;
	}
	void setDay(Date r)
	{
		Day=r.Day;
		month=r.month;
		year=r.year;
	}
	void setmonth(String r)
	{
		month=r;
	}
	int getyear()
	{
		return year;
	}
	void setyear(int r)
	{
		year=r;
	}
	void setDate()
	{
		String H=JOptionPane.showInputDialog("Enter Date in DD/MM/YYYY Format ");
		String[] arr= H.split("/",3);
		setDay(Integer.parseInt(arr[0]));
		setmonth(arr[1]);
		setyear(Integer.parseInt(arr[2]));
	}
	void setDate(Date d)
	{
		this.Day=d.Day;
		this.month=d.month;
		this.year=d.year;
	}
	public String toString()
	{
		return +Day+"/" +month+"/"+year;
	}
}
