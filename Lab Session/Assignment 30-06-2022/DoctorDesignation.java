package corejava;
import java.util.*;
import java.io.*;
//class Doctor which has private attributes
class Doctor
{
    private int doctor_id;
    private String doctor_name, location;

    Doctor(int i,String n,String l)
    {
        doctor_id = i;
        doctor_name = n;
        location = l;
    }

    public void setdoctor_id(int i) {
        doctor_id = i;
    }

    public void setdoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
  //Method getDetails() to display the attributes
    public void getDetails()
    {
        System.out.println("Doctor ID: "+doctor_id);
        System.out.println("Doctor Name: "+doctor_name);
        System.out.println("Location: "+location);
    }
}
//class SpecialistDoctor which should inherit Doctor class and have to override getDetails() with additional information specialist to be display
class SpecialistDoctor extends Doctor
{
    private String specialist;

    public void setSpecialist(String s) {
        this.specialist = s;
    }

    public String getSpecialist() {
        return specialist;
    }

    SpecialistDoctor(int i,String n,String l,String s)
    {
        super(i, n, l);
        specialist = s;
    }

    public void getDetails()
    {
        super.getDetails();
        System.out.println("Specialist: "+specialist);
    }
}

public class DoctorDesignation 
{
    public static void main(String[] args) 
    {
    	//Create Scanner Class
        Scanner sc = new Scanner(System.in);

        String t = sc.nextLine();

        if(t.equalsIgnoreCase("Specialist"))
        {
            SpecialistDoctor s = new SpecialistDoctor(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(), sc.nextLine());
            s.getDetails();
        }
        else if(t.equalsIgnoreCase("Doctor"))
        {
            Doctor s = new Doctor(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
            s.getDetails();
        }
        else
        {
            System.out.println("Invalid Input");
        }     
        sc.close();  
    }
}