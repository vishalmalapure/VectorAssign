import java.util.*;

class VectorUniqueElement {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        // Add 10 integers (try changing values to test)
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

     int c=0;

        // Compare each element with all others
        for (int i = 0; i < v.size(); i++) {
            for (int j = i + 1; j < v.size(); j++) {
                if (v.get(i).equals(v.get(j))) {
                   c++;
                    break;
                }
            }
            if (c!=0)
		 break;
        }

        if (c==0) {
            System.out.println("All elements are unique.");
        } else {
            System.out.println("There are duplicate elements.");
        }
    }
}
