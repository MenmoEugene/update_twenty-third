//����ʵ��Ӧ��
/*
�� ͨ�����Ҳ�������Ϊռλ����
���͵��޶���
�� extends E�����Խ���E���ͻ���E�������͡�����
?  super E�����Խ���E���ͻ���E�ĸ����͡� ����
*/
import java.util.*;
class GenericDemo6 
{
	public static void main(String[] args) 
	{
		/*
		ArrayList<String> al = new ArrayList<String>();

		al.add("adg1");
		al.add("adg2");
		al.add("adg3");

		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(4);
		al1.add(7);
		al1.add(1);

		printColl(al);
		printColl(al1);
		*/
		ArrayList<Person> al = new ArrayList<Person>();
		al.add(new Person("abc1"));
		al.add(new Person("abc2"));
		al.add(new Person("abc3"));
		//printColl(al);

		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(new Student("abc__1"));
		al1.add(new Student("abc__2"));
		al1.add(new Student("abc__3"));
		printColl(al1);//ArrayList<Person> al = new ArrayList<Student>(); error
	}
	public static void printColl(ArrayList<? extends Person> al1)
	{
		Iterator<? extends Person> it = al1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getName());
		}
	}
/*
	public static void printColl(ArrayList<?> al)//ArrayList<String> al = new ArrayList<Integer>();error
	{
		Iterator<?> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
*/
}

class Person
{
	private String name;
	Person(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
}
class Student extends Person
{
	Student(String name)
	{
		super(name);
	}
}