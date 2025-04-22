public class stringpalindrome {
    public static void main(String[] args) {
        String str = "paisa";
        String str1 = "paisa";
        int count =0;
        for(int i = 0; i < str.length(); i++ ){
            if(str.charAt(i) == str1.charAt(i)){
            count++;
            }
            else{
                count=0;
            }
        }
        if(count != 0){
        System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
