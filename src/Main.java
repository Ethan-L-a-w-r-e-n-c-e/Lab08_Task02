import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int favoriteInt = InputHelper.getInt(scan,"What is your favorite Integer");
        System.out.println("Your favorite integer is : " + favoriteInt);
    }
}