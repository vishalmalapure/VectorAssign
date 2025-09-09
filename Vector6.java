import java.util.*;

class VectorPrime6 {
    public static void main(String s[]) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(21);
        v.add(2);
        v.add(3);
        v.add(7);
        v.add(11);
        v.add(28);

        System.out.println("Prime numbers in the vector are:");

        Iterator<Integer> i = v.iterator();
        while (i.hasNext()) {
            int num = i.next();
            int count = 0; // counts factors

            if (num > 1) { // primes are greater than 1
                for (int k = 2; k <= num / 2; k++) {
                    if (num % k == 0) {
                        count++; // found a factor
                        break;
                    }
                }
                if (count == 0) { // no factors → prime
                    System.out.println(num);
                }
            }
        }
    }
}
