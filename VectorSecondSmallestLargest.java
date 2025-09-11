import java.util.*;

class VectorSecondSmallestLargest {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        // Adding 15 integers (with some duplicates for testing)
        v.add(25);
        v.add(10);
        v.add(85);
        v.add(40);
        v.add(95);
        v.add(70);
        v.add(15);
        v.add(5);
        v.add(95); // duplicate
        v.add(55);
        v.add(35);
        v.add(75);
        v.add(20);
        v.add(90);
        v.add(10); // duplicate

        // Step 1: Find smallest and largest
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < v.size(); i++) {
            int num = v.get(i);
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;
        }

        // Step 2: Find second smallest and second largest
        int secondSmallest = Integer.MAX_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < v.size(); i++) {
            int num = v.get(i);

            // For second smallest (exclude duplicates of smallest)
            if (num > smallest && num < secondSmallest) {
                secondSmallest = num;
            }

            // For second largest (exclude duplicates of largest)
            if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }

        System.out.println("Vector elements: " + v);
        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + secondSmallest);
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}
