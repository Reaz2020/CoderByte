/*import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        a ab = new a();
        int[] nums = {0,1};
        ab.maxWidthRamp( nums);
       // System.out.println(ab.minAddToMakeValid("((())"));
        //------------------------------------divider between problems main  ------------------------------------------
      problemsTwo p = new  problemsTwo();

     System.out.println(  p.FindIntersection(new String[] {"1, 3, 4, 7, 13",
             "1, 2, 4, 13, 15"}) );
    }
}
class a{
    //pr 962. Maximum Width Ramp - leetcode
    public int maxWidthRamp(int[] nums) {
        int maxVal=0;

        ArrayList <Integer>  widthList =new ArrayList();
        int i = 0;
        int j= 0;
        int width=0;
        int longestWidth=0;

        for (i=0;i < nums.length; i++) {
            for (j=i+1;j < nums.length; j++) {
                if(nums[i] <= nums[j]){
                    width=j-i;
                    widthList.add(width);
                }

            };
        }

        maxVal = Collections.max(widthList);
        // System.out.println(maxVal);
        return maxVal;
    }
    //----------------------------------divider between problems --------------------------------------------
    public int minAddToMakeValid(String s) {


        Character openingParentheses='(';
        Character closingParentheses=')';
        int openingPCount=0;
        int closingPCount=0;



        int move =0;


        for (int i=0; i < s.length()-1; i++) {

            if(s.charAt(i)==openingParentheses && s.charAt(i+1)!=closingParentheses){

                move++;
            }

            if(s.charAt(i+1)==closingParentheses && s.charAt(i)!=openingParentheses){

                move++;
            }


        }



        if(  (s.charAt(0))==closingParentheses){
            move++;
        }
        if(  (s.charAt(s.length()-1))==openingParentheses  ){
            move++;
        }

        int openClosDifference=0;
        for (int i=0; i < s.length(); i++) {

            if(s.charAt(i)==openingParentheses){

                openingPCount++;
            }

            if(s.charAt(i)==closingParentheses){

                closingPCount++;
            }


        }

        openClosDifference=openingPCount-closingPCount;
        int positiveNumber = Math.abs(openClosDifference);

        System.out.println(openClosDifference);


        return move;  }
    //-----------------------------------divider between problems-------------------------------------------
}
*/

//problem 3 coderbyte
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        // Example string
        String text = "H3llo W@rld 123 Java!!";

        // Compile the pattern for letter sequences
        Pattern pattern = Pattern.compile("[a-zA-Z]+");

        // Create a matcher to find matches in the text
        Matcher matcher = pattern.matcher(text);
        ArrayList<String> matches = new ArrayList<>();

        while (matcher.find()) {
            matches.add(matcher.group());
        }

        // Find the largest word
        String largestWord = "";

        for (String word : matches) {
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }

        System.out.println(largestWord);
    }
}
