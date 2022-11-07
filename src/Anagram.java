import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your first line of string: ");
        String a = scanner.nextLine();
        System.out.print("Your second line of string: ");
        String b = scanner.nextLine();
        boolean isAnagram = false;
        boolean[] visited = new boolean[b.length()]; // how to declare a boolean array

        if (a.length() == b.length()){
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                isAnagram = false;
                for (int j = 0; j < a.length(); j++) {
                    if (b.charAt(j) == c && !visited[j]){
                        visited[j] = true;
                        isAnagram = true;
                        break;
                    }
                }
                if(!isAnagram){
                    break;
                }
            }
        }

        if(isAnagram){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
        scanner.close();
    }
}
