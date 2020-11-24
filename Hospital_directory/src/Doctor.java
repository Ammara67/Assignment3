public class Doctor{
	private
	String Name,Department,Specialization;
	String cnic, phone_no;
	char gender;  
	Doctor()
	{
		Name="Ammara";
		Department="gynae";
		Specialization="mbbs";
		cnic="33333-1111111-1";
		phone_no="0333-XXXXXXX";
		gender='F';
	}
	Doctor(String N,String D,String S,String c,String p,char g)
	{
		Name=N;
		Department=D;
		Specialization=S;
		cnic=c;
		phone_no=p;
		gender=g;
	}
	String getName()
	{
		return Name;
	}
	void setName(String r)
	{
		Name=r;
	}
	String getDepartment()
	{
		return Department;
	}
	void setDepartment(String r)
	{
		Department=r;
	}
	String getSpecialization()
	{
		return Specialization;
	}
	void setSpecialization(String r)
	{
		Specialization=r;
	}
	String getcnic()
	{
		return cnic;
	}
	void setcnic(String r)
	{
		cnic=r;
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
	public String toString()
	{
		return "Doctor's Name: "+Name+" Departmant: " +Department+" Specialization "+Specialization+" cnic: "+cnic+" phone_no "+phone_no+ " gender: "+gender;
	}
	void setDoctor(Doctor d)
	{
		Name=d.Name;
		Department=d.Department;
		Specialization=d.Specialization;
		cnic=d.cnic;
		phone_no=d.phone_no;
		gender=d.gender;
	}
}