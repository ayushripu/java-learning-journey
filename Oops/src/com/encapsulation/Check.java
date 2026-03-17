package com.encapsulation;
class Eleven
{
	private int roll;
	private String name;
	
	public int getRollNumber()
	{
		return roll;
	}
	public void setRollNumber(int rollnumber)
	{
		this.roll=rollnumber;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}
class Twelve extends Eleven
{
    public int getStudentRoll()
    {
        return super.getRollNumber();
    }
    public void setStudentRoll(int rr)
    {
    	super.setRollNumber(rr);
    }
    public String getStudentName()
    {
        return super.getName();
    }
    public void setStudentName(String nn)
    {
    	super.setName(nn);
    }
}

public class Check {

	public static void main(String[] args) {

		Twelve t = new Twelve();
		
		t.setName("Ayush");
		t.setRollNumber(101);
		
		System.out.println("In Supper class: "+t.getName()+" | "+ t.getRollNumber());
		
		System.out.println();
		t.setStudentRoll(55);
		t.setStudentName("Ved");
		
		System.out.println("In Sub class: "+t.getStudentName()+" | "+ t.getStudentRoll());
		
				
	}

}
