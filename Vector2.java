class Vector2
{
	public static void main(String a[])
		{

			Vector v=new Vector();
			v.add(10);
			v.add(20);
			v.add(30);
			v.add(40);
			v.add(50);
		Iterator i=v.iterator();
		int max=[int]v.get(0);
		while(i.hasNext())
			{	
				Object ob=i.next();
				if((int)obj>max)
					max=(int)obj;
			}
		System.out.println("max value is"+max);
		}
}
		
			