package lap4;

import java.util.Scanner;

public class StringApp {
    Scanner scanner = new Scanner(System.in);

    // bai1
    public void CheckSubString(String mainString, String subString) {
        boolean contains = mainString.contains(subString);
        if (contains == true) {
            System.out.println("chuoi con '" + subString + "' co trong chuoi\n" + mainString);
        } else {
            System.out.println("chuoi con '" + subString + "' k co trong chuoi\n" + mainString);
        }
    }

    // bai2
    public int CountCharInString(String mainString, char searchChar) {
        int leng = mainString.length();
        int coust = 0;
        String strSearchChar = String.valueOf(searchChar);
        for (int i = 0; i < leng; i++) {
            char kitu = mainString.charAt(i);
            String strKitu = String.valueOf(kitu);
            if (strKitu.equals(strSearchChar)) {
                coust++;
            }
        }
        return coust;
    }

    // bai3
    public String UpperCaseToString(String mainString) {
        mainString = mainString.toUpperCase();
        return mainString;
    }

    // bai4
    public void isPalindrome(String mainString) {

        int leng = mainString.length();
        int coust = 0;
        for (int k = 0; k < leng / 2; k++) {
            Character charK = mainString.charAt(k);
            Character charLastK = mainString.charAt(leng - k - 1);
            if (!charK.equals(charLastK)) {
                coust++;
            }
        }
        if (coust >= 1) {
            System.out.println("chuoi '" + mainString + "' k phai chuoi doi xung");
        } else {
            System.out.println("chuoi '" + mainString + "' chuoi doi xung");
        }
    }
}
