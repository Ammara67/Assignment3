import javax.swing.JOptionPane;
public class Demo
{
	public static void main(String args[])
	{
		Date[] D=new Date[2];
		Time[] T=new Time[2];
		String choice;
		Patient[] p=new Patient[2];
		int indexno=0;
		p[0]=new Patient("Ayesha","37405-6666531-0","roomno1, first floor, E11, Rwp","0333-6666666",'F',30);
		p[1]=new Patient("Uzma","37405-6666531-0","roomno1, first floor, E11, Rwp","0333-6666666",'F',30);
		Patient[] i= new Indoor_Patient[2];
		Outdoor_Patient[] o=new Outdoor_Patient[2];
		Doctor[] doc= new Doctor[2];
		doc[0]=new Doctor("Nimra","surgical","Mbbs","33333-7777777-1","0333-xxxxxxx",'f');
		doc[1]=new Doctor("Hira","ENT","Mbbs","33333-7777777-1","0333-xxxxxxx",'f');
		do{
			choice=JOptionPane.showInputDialog("			Menu\n1-	Add an indoor patient\n2-	Add an outdoor patient\n3-	See the list of all Doctors\n4-	Search a doctor by name or department\n5-	See the list of all indoor patients\n6-	See the list of all appointments on a certain day\n7-	See the list of appointments of a certain doctor\n8-	Change the date or time of appointment of a certain patient.\n9-	Exit\nEnter no.");
			if(choice=="1")
			{
				String W=JOptionPane.showInputDialog("Enter wardno(w),bedno(b),Roomno(r), fee(f) and Date of Admit(DD/MM/YYYY) in 'w,b,r,f,DD/MM/YYYY' format ");
				String[] arr= W.split(",",5);
				int w= Integer.parseInt(arr[0]);
				int r= Integer.parseInt(arr[1]);
				int b= Integer.parseInt(arr[2]);
				int f= Integer.parseInt(arr[3]);
				String[] arr0= arr[4].split("/",3);
				D[0].setDay(Integer.parseInt(arr0[0]));
				D[0].setmonth(arr0[1]);
				D[0].setyear(Integer.parseInt(arr0[2]));
				i[indexno]=new Indoor_Patient(w,r,b,f,D[0],doc[0],p[0]);
				indexno++;
			}
			else{	if(choice=="2")
					{
						String F=JOptionPane.showInputDialog("Enter fee(f),Date of appoinment(dd/mm/yyyy),Time of Appoinment(hh:mm am/pm) in f,dd/mm/yyyy,hh:mm am/pm format");
						String[] arr1= F.split(",",3);
						int f= Integer.parseInt(arr1[0]);
						String[] arr2=arr1[1].split("/",3);
						D[1].setDay(Integer.parseInt(arr2[0]));
						D[1].setmonth(arr2[1]);
						D[1].setyear(Integer.parseInt(arr2[2]));
						String[] g=arr1[2].split(":",2);
						T[0].setHours(Integer.parseInt(g[0]));
						String[] h=g[1].split(" ",2);
						T[0].setMins(Integer.parseInt(h[0]));
						T[0].settime(h[1]);
						o[indexno]=new Outdoor_Patient(f,T[0],D[1],doc[1],p[1]);
						indexno++;
					}
					else{ 	if(choice=="3")
							{
								for (int j=0; j <2; j++)
									JOptionPane.showMessageDialog(null,doc[j]," Doctor' Info ",JOptionPane.WARNING_MESSAGE);
							}
							else{	if(choice=="4")
									{
										int flag=0;
										String ch=JOptionPane.showInputDialog("Select 'n' if you want to search by name or 'd' if you want to search by department");
										if (ch=="n")
										{
											String name=JOptionPane.showInputDialog("enter doctor's name");
											for (int j=0; j <2; j++)
											{
												if(doc[j].getName()==name)
												{
													flag++;
													JOptionPane.showMessageDialog(null,doc[j]," Doctor' Info ",JOptionPane.WARNING_MESSAGE);
												}	
											}
											if (flag==0)
											JOptionPane.showMessageDialog(null," this name does not exist"," Result ",JOptionPane.WARNING_MESSAGE);
										}
										else
										{
											String dept=JOptionPane.showInputDialog("enter doctor's department");
											for (int j=0; j <2; j++)
											{
												if(doc[j].getDepartment()==dept)
												{
													flag++;
													JOptionPane.showMessageDialog(null,doc[j]," Doctor' Info ",JOptionPane.WARNING_MESSAGE);
												}
											}
													if(flag==0)
														JOptionPane.showMessageDialog(null," this department does not exist"," Result ",JOptionPane.WARNING_MESSAGE);
										}
									}
									else{	if(choice=="5")
											{
												for(int j=0; j<2;j++)
												{
													if(i[j] instanceof Patient)
														JOptionPane.showMessageDialog(null,i[j],"List of Indoor Patients",JOptionPane.WARNING_MESSAGE);
												}
											}
											else{	if(choice=="6")
													{	
														int fo= 0;
														Date dat=new Date();
														dat.setDate();
														for (int j=0; j <2; j++)
														{
															if(o[j].getDate()==dat)	
															{
																fo++;
																JOptionPane.showMessageDialog(null,o[j].getTime(),"List of Appointments",JOptionPane.WARNING_MESSAGE);
															}
														}
														if(fo==0)
															JOptionPane.showMessageDialog(null," this Date does not exist"," Result ",JOptionPane.WARNING_MESSAGE);
													}
													else{	if(choice=="7")
															{	
																int foun=0;
																String name=JOptionPane.showInputDialog("enter doctor's name");
																for (int j=0; j <2; j++)
																{
																	if(o[j].getDoctorName()==name)	
																	{
																		foun++;
																		JOptionPane.showMessageDialog(null," Appointments : "+o[j].getDate()," follows as",JOptionPane.WARNING_MESSAGE);
																	}
																}
																if(foun==0)
																	JOptionPane.showMessageDialog(null," this doctor's name does not exist"," Result ",JOptionPane.WARNING_MESSAGE);
															}
															else{	if(choice=="8")
																	{	
																		int found = 0;
																		String ho=JOptionPane.showInputDialog("Enter name of the patient ");
																		for (int j=0; j <2; j++)
																		{   
																			if(o[j].getname()==ho)
																			{
																				found++;
																				String ph=JOptionPane.showInputDialog("Select 'd' to change Date or 't' to change time ");
																				if (ph=="d")
																					o[j].setDate();
																				else
																					o[j].setTime();
																			}
																		}	
																		if(found==0)
																				JOptionPane.showMessageDialog(null," this name does not exist"," Result ",JOptionPane.WARNING_MESSAGE);
																	}
															}}}}}}}
}while(choice!="9");
	}
}