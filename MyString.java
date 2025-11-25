public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("history", "stf")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i)>= 'A') && str.charAt(i)<= 'Z'){
                char lower =(char) (str.charAt(i) + 32);
                newStr += lower;
            }
            else{
                newStr += str.charAt(i);
            }
            
        }

        return newStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str2.length()>str1.length()) {
            return false;
        }
        if(str2.length()==0)
        {
            return true;
        }
        char firstCharStr2 = str2.charAt(0);
        for (int i = 0; i <= str1.length()-str2.length(); i++) {
            char current = str1.charAt(i);
            if (current == firstCharStr2) {
                boolean match = true;
                for (int j = 1; j < str2.length(); j++) {
                    current = str1.charAt(i + j);
                    if (current != str2.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return true;
                }

            }
        }
        return false;
    }
}
