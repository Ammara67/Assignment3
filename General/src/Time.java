import javax.swing.*;
public class Time {
	private
	int Hours;
	int Mins;
	String time;
	public 
	Time()
	{
		Hours=10;
		Mins=59;
		time="am";
	}
	Time(int h,int m,String t)
	{
		Hours=h;
		Mins=m;
		time=t;
	}
	int getHours()
	{
		return Hours;
	}
	void setHours(int r)
	{
		Hours=r;
	}
	int getMins()
	{
		return Mins;
	}
	void setMins(int r)
	{
		Mins=r;
	}
	String gettime()
	{
		return time;
	}
	void setTime(Time r)
	{
		Hours=r.Hours;
		Mins=r.Mins;
		time=r.time;   
	}  
	void settime(String r)
	{
		time=r;
	}
	public String toString()
	{
		return  +Hours+" : " +Mins+" ("+time+")";
	}
	void setTime()
	{
		String H=JOptionPane.showInputDialog("Enter Time in  Hr:Min am/pm Format ");
		String[] arr= H.split(":",2);
		setHours(Integer.parseInt(arr[0]));
		String[] arr1 = arr[1].split(" ",2);
		setMins(Integer.parseInt(arr1[0]));
		settime(arr1[1]);
	}
}