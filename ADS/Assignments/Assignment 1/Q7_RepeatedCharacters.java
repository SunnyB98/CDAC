package Que;
public class Q7_RepeatedCharacters {
    public static String findRepeats(String str, int index, int checkIndex, String result) {
        if (index == str.length() - 1) {
            return result;
        }
        if (checkIndex < str.length()) {
            if (str.charAt(index) == str.charAt(checkIndex)) {
                if (!result.contains(String.valueOf(str.charAt(index)))) {
                    result += str.charAt(index) + ",";
                }
            }
            return findRepeats(str, index, checkIndex + 1, result);
        } else {
            return findRepeats(str, index + 1, index + 2, result);
        }
    }
    public static void main(String[] args) {
        String input = "programming";
        String result = findRepeats(input, 0, 1, "");
        if (!result.isEmpty()) {
            result = result.substring(0, result.length() - 1);
        }
        System.out.println(result); 
    }
}
