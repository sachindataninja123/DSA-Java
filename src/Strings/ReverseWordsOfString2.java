package Strings;

public class ReverseWordsOfString2 {
    static void main(String[] args) {
//        Input: s = "Let's take LeetCode contest"
//        Output: "s'teL ekat edoCteeL tsetnoc"

        String s = "Let's take LeetCode contest";
//        String s = " pqr mno ";

        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int i = 0;


        while(i < n){
            while(i < n && s.charAt(i) == ' '){
                i++;
            }
            if(i >= n) break;

            int j = i;
            while(j < n && s.charAt(j) != ' '){
                j++;
            }

            String word = s.substring(i , j);
            StringBuilder rev = new StringBuilder(word);
            rev.reverse();

            if(ans.length() > 0){
                ans.append(" ");
            }

            ans.append(rev);

            i = j;

        }
        System.out.println(ans);
    }
}
