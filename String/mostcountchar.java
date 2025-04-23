public class mostcountchar {
    public static void main(String[] args) {
        String input = "heheheh";
        char[] characters = input.toCharArray();
        int count = 0;
        int prev = 0;
        int ans = 0;
        for (int i = 0; i < characters.length; i++) {
            count = 0;
            for (int j = i+1; j < characters.length; j++) {
                if (characters[i]==characters[j]) {
                    count++; 
                }
            }
            if (prev<count) {
                ans = i;
            }
        }
        System.out.println("The most repeated element is : " + characters[ans]);
    }
}