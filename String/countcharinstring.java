public class countcharinstring {
    public static void main(String[] args) {
        String palindrome = "racecar";
 
        char[] arr = palindrome.toCharArray();
        int count = 0;
        char ch = 'r';
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
            if(arr[i] == ch){
                count++;
            }
        }
        System.out.println( ch + " is present " + count + " times ");
    }
}
