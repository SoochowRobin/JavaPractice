public class GetMaxCharInString {

    public static char getMax(String word){
        if (word == null || word.isEmpty()){
            return ' ';
        }

        char maxChar = ' ';
        int maxCount = 0;
        int[] charCount = new int[Character.MAX_VALUE+1];
//        System.out.println(Character.MAX_VALUE+1);
        for (int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
//            System.out.println(ch);

            // increment this character's count and compare it to our max
            if (++charCount[ch] > maxCount){
                maxCount = charCount[ch];
                maxChar = ch;
            }
        }
//        System.out.println(charCount[0]);
        return maxChar;
    }

    public static void main(String[] args) {
        char c = getMax("hellooooo");
        System.out.println(c);
    }
}
