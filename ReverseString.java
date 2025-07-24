import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String original =sc.nextLine();
        //Convert string to character array

        char[] characters = original.toCharArray();
       
       //Reverse in-place using two pointer approach
       int left=0;
       int right=charcaters.length-1;
       while(left<right)

{
    char temp = characters[left];
    characters[left] = characters[right];   
    charcters[right] = temp;
    left++;
    right--;
}        sc.close();
    }
}