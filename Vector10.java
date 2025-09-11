import java.util.*;

class Vector10 {
    public static void main(String a[]) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(60);
        v.add(70);
        v.add(15);
        v.add(65);
        v.add(80);

        int minors = 0, adults = 0, seniors = 0;

        for (int i = 0; i < v.size(); i++) {
            int age = v.get(i);

            if (age < 18) {
                minors++;
            } else if (age >= 18 && age <= 60) {
                adults++;
            } else {
                seniors++;
            }
        }

        System.out.println("Total Minors (<18): " + minors);
        System.out.println("Total Adults (18–60): " + adults);
        System.out.println("Total Seniors (>60): " + seniors);
    }
}
