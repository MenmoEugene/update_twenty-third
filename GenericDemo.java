import java.util.*;
/*
	���ͣ�JDK1.5�汾�Ժ���ֵ������ԣ����ڽ����ȫ���⣬��һ�����Ͱ�ȫ���ơ�

	�ô���
		1.������ʱ�ڳ�������ClassCastException��ת�Ƶ��˱���ʱ�ڡ�
			���ڳ���Ա������⣬����������������٣���ȫ��
			
		2,������ǿת�����鷳��
*/
class GenericDemo
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();

		al.add("sdfdsf");
		al.add("sdfd1");
		al.add("sdfd31");

		//al.add(4);

		Iterator <String>it = al.iterator();
		while (it.hasNext())
		{
			String s = it.next();

			System.out.println(s+":"+s.length());
		}
	}
}
