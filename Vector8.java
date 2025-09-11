import java.util.*;
class Vector8
	{
		public static void main(String a[])
			{
				Vector<Integer> v=new Vector<>();
				v.add(10);
				v.add(20);
				v.add(30);
				v.add(40);
				v.add(50);	
				v.add(60);
				v.add(70);
				v.add(80);
				v.add(90);
				v.add(100);
				
				

			int t=(int)v.get(0);
			int g=(int)v.get(1);
			for(int i=0;i<8;i++)
				{
					v.get(i)=(int)v.get(i+1);
				}
			v.add(8,t);
			v.add(9,g);
				System.out.println(v);
			}
	}
					
			
				

				