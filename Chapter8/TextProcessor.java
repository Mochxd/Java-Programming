package Chapter8;

import java.util.Arrays;

public class TextProcessor {
    public static void main(String[] args) {
        countwords("Hello Qa, We heat developers");
        reversedString("Hello world");
        addSpaces("IamMohamedIt'sMeEman");
        String t = "Hello";
         System.out.println(t.charAt(1));
        String t2 = "avacado";
        System.out.println(Arrays.toString(t2.split("a")));
    }
    public static void countwords(String text){
        var words = text.split(" ");
        int number = words.length;
        System.out.println(String.format("The number of words is %d" ,number));
        for (var word : words){
            System.out.println(word);
        }
    }
    public static void reversedString(String text){
        for (int i=text.length()-1; i>=0; i--){
            System.out.println(text.charAt(i));
        }
    }
    public static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);
        for (int i=0; i< modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
