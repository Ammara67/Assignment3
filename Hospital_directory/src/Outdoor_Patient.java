public class Outdoor_Patient extends Patient{
	private
	Patient p1=new Patient();
	Date date_of_app=new Date(21,"jan",2010);
	Time time_of_app=new Time(11,55,"am");
	Doctor doctor=new Doctor();
	int fee;
	public
	Outdoor_Patient()
	{
		fee=500;
	}
	Outdoor_Patient(int f)
	{
		fee=f;
	}
	Outdoor_Patient(int f,Time t,Date d,Doctor D,Patient P)
	{
		fee=f;
		date_of_app.setDate(d);
		time_of_app.setTime(t);	
		doctor.setDoctor(D);
		p1.setPatient(P);
	}
	String getDoctorName()
	{
		return doctor.getName();
	}
	Patient getPatient()
	{
		return p1;
	}
	Doctor getDoctor()
	{
		return doctor;
	}
	Date getDate()
	{
		return date_of_app;
	}
	void setDate()
	{
		date_of_app.setDate();
	}
	Time getTime()
	{
		return time_of_app;
	}
	void setTime()
	{
		time_of_app.setTime();
	}
	int getfee()
	{
		return fee;
	}
	void setfee(int r)
	{
		fee=r;
	}
	public String toString()
	{
		return "Patient's Info: "+p1+"  date_of_appointment= "+ date_of_app+" time_of_appointment: "+time_of_app+" Doctor's Info: "+doctor+" fee "+fee;
	}
}
