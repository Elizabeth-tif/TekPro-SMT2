import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // Read input strings A and B
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        scanner.close();
        
        // 1. Calculate sum of lengths of A and B
        int sumLength = A.length() + B.length();
        
        // 2. Compare strings A and B lexicographically
        String lexicographicalComparison = A.compareTo(B) > 0 ? "Yes" : "No"; //if compare true (1) [> 0 true] then string = yes if compare false (0) [>0 false] then string = no
        
        // 3. Capitalize first letter of both strings A and B
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        
        // 4. Print results
        System.out.println(sumLength);
        System.out.println(lexicographicalComparison);
        System.out.println(capitalizedA + " " + capitalizedB);
    }
}
