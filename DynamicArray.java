import java.util.Scanner;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Collections;
class DynamicArray
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(343);
		list.add(2334);
		list.add(324);
		list.add(345);
		Collections.sort(list);
		out.print(list);


	}
}