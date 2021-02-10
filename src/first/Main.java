package first;
import java.util.ArrayList;
import java.util.*;//include all libraries in the util namespace
public class Main {
	static public void main(String[] arg)
	{
		ArrayList<Integer> Arr=new ArrayList<Integer>(3);
		Arr.add(4);
		Arr.add(5);
		Arr.add(2);
		Arr.add(2);
		ListIterator<Integer> Li=Arr.listIterator();
		var x=0;
		while(x<Arr.size())
		{
			System.out.println(Li.next()+"//");
			x++;
		}
		try {
			int aa=100/0;//error ayto throwdx
		}catch(Exception e)
		{
			System.out.println("Soemthing is wrong");
		}finally {
			System.out.println("Finally called");
		}
		
		terran t=new tank();
		t.HP();
	}
}
