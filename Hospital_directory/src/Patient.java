public class Patient {
	private//Question no 1
	String name;
	String cnic;
	String address; 
	String phone_no;
	char gender;
	int age;
	public
	Patient()
	{
		name="Ammara";
		cnic="37405-5463806-2";
		address= "E/173/A, N/P, S/town,Rwp."; 
		phone_no= "0349-1202428";
		gender='F';
		age=21;
	}
	Patient(String n,String c,String a,String p,char g,int i)
	{
		name=n;
		cnic=c;
		address= a; 
		phone_no= p;
		gender=g;
		age=i;
	}
	String getname()
	{
		return name;
	}
	void setname(String r)
	{
		name=r;
	}
	String getcnic()
	{
		return cnic;
	}
	void setcnic(String r)
	{
		cnic=r;
	}
	String getaddress()
	{
		return address;
	}
	void setaddress(String r)
	{
		address=r;
	}
	String getphone_no()
	{
		return phone_no;
	}
	void setphone_no(String r)
	{
		phone_no=r;
	}
	char getgender()
	{
		return gender;
	}
	void setgender(char r)
	{
		gender=r;
	}
	int getage()
	{
		return age;
	}
	void setage(int r)
	{
		age=r; 
	}
	public String toString()
	{
		return "Patient's Name: "+name+" cnic: "+cnic+"  phone_no "+phone_no+ " address: "+address+" gender: "+gender+" age "+age;
	}
	void setPatient(Patient P)
	{
		name=P.name;
		cnic=P.cnic ;
		address=P. address; 
		phone_no= P.phone_no;
		gender=P.gender;
		age=P.age;
	}
}