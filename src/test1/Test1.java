package test1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi: ");
        String s = scanner.nextLine();
        System.out.println("Chuỗi dài nhất là: " + getString(s));
    }
    public static String getString(String string){
        String[] strings = string.split(" ");
        String longString = strings[0];
        for (int i = 1; i < strings.length; i++) {
            if (strings[i].length() > longString.length()){
                longString = strings[i];
            }
        }
        return longString;
    }
}
