import java.util.ArrayList;
import java.util.List;
public class problemsTwo {

    public String FindIntersection(String[] strArr) {
        // Split the input strings by ", "
        String[] list1 = strArr[0].split(", ");
        String[] list2 = strArr[1].split(", ");

        // Use a list to store the intersection
        List<String> intersection = new ArrayList<>();

        // Compare each number from list1 with numbers in list2
        for (String num1 : list1) {
            for (String num2 : list2) {
                if (num1.equals(num2)) {
                    intersection.add(num1);  // Add to intersection list if they match
                    break;  // No need to compare further for this number
                }
            }
        }

        // If no intersection found, return "false"
        if (intersection.isEmpty()) {
            return "false";
        }

        // Return the intersection as a comma-separated string
        return String.join(", ", intersection);
    }



    //------------------------------------------------------------------------------

}
