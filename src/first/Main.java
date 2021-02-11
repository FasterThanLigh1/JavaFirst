package first;
import java.util.ArrayList;
import java.util.*;//include all libraries in the util namespace
import java.io.*;//handle file io
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
			int aa=100/1;//error ayto throwdx
		}catch(Exception e)
		{
			System.out.println("Soemthing is wrong");
		}finally {
			System.out.println("Finally called");
		}
		try {
		File f=new File("normal.txt");
		PrintWriter pw=new PrintWriter(f);
		pw.println("ST stupid in this file");
		pw.println("Die");
		pw.close();
		if(!f.exists())
		{
			f.createNewFile();
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		Date date=new Date();
		System.out.println(date);//get current date
		
		terran t=new tank();
		t.HP();
	}
}
