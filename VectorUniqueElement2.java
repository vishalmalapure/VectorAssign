import java.util.*;

class VectorUniqueElement {
    public static void main(String aa[]) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(10);
        v.add(30);
        v.add(80);
        v.add(90);
        v.add(100);
	int count=1;
        for (int i = 0; i < v.size(); i++) {
           count = 1; // count the element itself

            for (int j =i+1; j < v.size(); j++) {
                if (v.get(i).equals(v.get(j))) {
                    count++;
                }
            }
		if(count==1)
				System.out.println(v.get(i));

        }
	
    }
}
