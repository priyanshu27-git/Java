class palindrome {
    public static void main(String[] args)
    {
        String str = "madam";
        int i=0,j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                System.out.println("Not Palindrome");
                break;
            }
            else
            {
                i++;
                j--;
                System.out.println("Palindrome");
                break;
            }
        }
    }
}
