package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringAndNumberCombine {
	
	public static void main(String[] args) {
        String s = "123454321Police234126";
        
        // Separate digits and letters
        List<Character> digits = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.add(c);
            } else if (Character.isLetter(c)) {
                letters.add(c);
            }
        }
        
        // Sort digits and letters
        String sortedDigits = digits.stream()
                                    .sorted()
                                    .map(String::valueOf)
                                    .collect(Collectors.joining());
        
        String sortedLetters = letters.stream()
                                      .sorted()
                                      .map(String::valueOf)
                                      .collect(Collectors.joining());
        
        // Output results
        System.out.println("Sorted digits: " + sortedDigits);
        System.out.println("Sorted letters: " + sortedLetters);
    }

}
