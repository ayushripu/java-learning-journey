public class CheckImpo
{	private int age;
	private String name;
	public void setName(String newname)
	{
		name=newname;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int newage)
	{
		age=newage;
	}
	public int getAge()
	{
		return age;
	}
	public static void main(String[]args)
	{
		CheckImpo ch = new CheckImpo();
		ch.setName("Ayush");
		ch.setAge(24);
		System.out.println("Name : "+ch.getName());
		System.out.println("age : "+ch.getAge());
	}
}