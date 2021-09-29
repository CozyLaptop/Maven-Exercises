import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.*;

public class MyFirstTest {
    @Test
    public void isCodeup(){
        System.out.println("Checking Codeup");
        assertEquals("Codeup", "Codeup");
    }
    @Test
    public void isLanguages(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = languages;
        System.out.println("Checking languages");
        assertNotSame(languages, moreLanguages);
    }
    @Test
    public void isNumbersArray(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        assertArrayEquals(numbers, otherNumbers);
    }
    @Test
    public void containsLetter(){
//        Scanner sc = new Scanner(System.in);
//        String language = sc.nextLine();
        String language = "PHP";
        System.out.println(language.contains("J"));
        System.out.println(language.contains("H"));
        assertFalse(language.contains("J"));
        assertTrue(language.contains("H"));
    }
}
