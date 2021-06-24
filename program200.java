import java.util.*;

class Program200
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sobj.nextLine();
		Demo dobj = new Demo();
		int ret = dobj.WordCount(str);
		System.out.println("Number of Words are : "+ret);
	}
}

class Demo
{
	public int WordCount(String str)
	{
		String temp =str.trim().replaceAll("[ ]{2,}"," ");
		String Arr[] = temp.split(" ");
		return Arr.length;
	}
}