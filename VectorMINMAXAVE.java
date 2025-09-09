import java.util.*;

class VectorMINMAXAVE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Float> v = new Vector<>();

        System.out.println("Enter 10 floating-point numbers:");

        // Input 10 floating-point numbers
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            float num = sc.nextFloat();
            v.add(num);
        }

        // Initialize sum, max, min
        float sum = 0;
        float max = v.get(0);
        float min = v.get(0);

        // Calculate sum, max, min
        for (int i = 0; i < v.size(); i++) {
            float val = v.get(i);
            sum += val;
            if (val > max) 
		max = val;
            if (val < min) 
		min = val;
        }

        // Calculate average
        float average = sum / v.size();

        // Display results
        System.out.println("\n--- Results ---");
        System.out.println("Numbers: " + v);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
