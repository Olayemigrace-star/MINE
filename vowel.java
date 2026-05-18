public class vowel{


public static void main(String[] args){

System.out.print(countVowel("sjkufge"));
}

public static int countVowel(String vowel)
    {
        int count = 0;
        for (int i = 0; i < vowel.length(); i++)
        {
            if (vowel.charAt(i) == 'a' || vowel.charAt(i) == 'e' || vowel.charAt(i) == 'i'
                    || vowel.charAt(i) == 'o' || vowel.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}


