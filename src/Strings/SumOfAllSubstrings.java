package Strings;

public class SumOfAllSubstrings {
    static void main(String[] args) {
        String s = "6759";

        int n = s.length();
        int sum = 0;

        for(int i = 0; i<n; i++){
            for(int j = i; j<n; j++){
                System.out.print(s.substring(i , j + 1) + " ");
                sum += Integer.parseInt(s.substring(i ,j+1));
            }

            System.out.println();
        }

        System.out.println("Sum of all substrings is: "+  sum);
    }
}
