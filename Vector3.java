import java.util.*;
class Vector3
	{
		public static void main(String a[])
		{
			Vector<Integer> v=new Vector<>();
			v.add(10);
			v.add(20);
			v.add(30);
			v.add(10);
			v.add(20);
			v.add(10);
			v.add(30);
			v.add(60);
			v.add(80);
			v.add(90);
			
				
			for(int i=0;i<9;i++)
				{
					for(int j=i+1;j<9;j++)
						{
							if((int)v.get(i)>(int)v.get(j))
								{	
									int x=(int)v.get(i);
									int y=(int)v.get(j);
									v.set(i,y);
									v.set(j,x);
								}
						}
				}
				System.out.println(v);
				int req=0;
				for(int i=0;i<9;i++)
				{	
					if((int)v.get(i)==(int)v.get(i+1))	
						{
								if(v.get(i)!=req)
									{
									System.out.println(v.get(i));
									req=v.get(i);
									}
						}
				}
				
			}
}