
class palindrome {

    public static void main(String[] args) {
        String str = "eye";
        int i=0,j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                break;
            }
            else
            {
                i++;
                j--;
            }
        }
        if (i >= j) {
            System.out.println("Palindrome"); 
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
