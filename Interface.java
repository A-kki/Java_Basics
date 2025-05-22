import static java.lang.System.out;
class A
{
	void show()
	{
		out.println("CLASS A");
	}
}
interface B
{
	void show();
}
class C extends A implements B
{
	
	public void show()
	{
		super.show();
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