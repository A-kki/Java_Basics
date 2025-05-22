import static java.lang.System.out;
interface A
{
	void show();
	
}
interface B
{
	void show();
}
class C implements A,B
{
	
	public void show()
	{
		out.println("INTERFACE A");
		out.println("INTERFACE B");
	}
	void get()
	{
 		out.println("CLASS C");
	}
}
class Main
{
	public static void main(String[] args)
	{
		C obj=new C();
		obj.show();
		obj.get();
	}
}