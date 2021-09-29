import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Hello!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a message!");
        String userInput = sc.nextLine();
        System.out.println();
        System.out.println(StringUtils.isNumeric(userInput));
        System.out.println(StringUtils.swapCase(userInput));
        System.out.println(StringUtils.reverse(userInput));
        System.out.println(RandomStringUtils.random(20, true, true));
    }
}
