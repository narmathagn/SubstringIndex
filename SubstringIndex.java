import java.util.*;
public class SubstringIndex{
		public static void main(String args[]){
			String s1="test123string";
			String s2="123";
			int a=0;
			if(s1.contains(s2))
			{
				a=1;
			}
			else
			{
				a=-1;
			}
			char s=s2.charAt(0);
			if(a==1)
			{
				for(int i=0;i<s1.length();i++)
				{
					if(s1.charAt(i)==s)
					{
						System.out.println(i);
					}
				}
			}
			else
			{
				System.out.println(a);
			}
	}
}