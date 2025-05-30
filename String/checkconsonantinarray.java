public class checkconsonantinarray {
        public static void main(String[] args) {
            String palindrome = "racecarnskf";
            int count = 0;
            char [] ch = palindrome.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if(ch[i] == 'a' | ch[i] == 'e' | ch[i] == 'i' | ch[i] == 'o' | ch[i] == 'u'){
                    count++;
                }
            }
            System.out.println("Number of Vowels = " + count);
            System.out.println("Number of consonants = " + (ch.length - count));   
        }
 }
