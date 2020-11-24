public class Indoor_Patient extends Patient
{
	private
	Patient p1=new Patient();
	int wardno;
	int Roomno;
	int bedno;
	int fee;
	Doctor doctor= new Doctor();
	Date date_of_adm;
	public
	Indoor_Patient()
	{
		 wardno=1;
		 Roomno=1;
		 bedno=1;
		 fee=500;
	}
	Indoor_Patient(int w, int r, int b,int f)
	{
		 wardno=1;
		 Roomno=1;
		 bedno=1;
		 fee=500;
	}
	Indoor_Patient(int w, int r, int b,int f,Date d,Doctor D,Patient P)
	{
		 wardno=1;
		 Roomno=1;
		 bedno=1;
		 fee=500;
		 date_of_adm.setDate(d);
		 doctor.setDoctor(D);
		 p1.setPatient(P);
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
		return date_of_adm;
	}
	int getwardno()
	{
		return wardno;
	}
	void setwardno(int r)
	{
		wardno=r;
	}
	int getRoomno()
	{
		return Roomno;
	}
	void setRoomno(int r)
	{
		Roomno=r;
	}
	int getbedno()
	{
		return bedno;
	}
	void setbedno(int r)
	{
		bedno=r;
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
		return "Patient's Info: "+p1+" admit in wardno: "+wardno+" Roomno= "+ Roomno+" bedno "+bedno+"  date_of_admission= "+ date_of_adm+" Doctor's Info: "+doctor+" fee "+fee;
	}
}