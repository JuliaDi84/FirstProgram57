package StringEx;

import java.sql.SQLOutput;
import java.util.Locale;

public class StringMain {
    public static void main(String[] args){
        String x="ABC";
        System.out.println(x.toLowerCase());
        String y=x.toLowerCase();
        System.out.println(y);

        String a="Ana are mereA";
        String b="Ana are mere";
        String c="A";
        String d = "                   bb               ";
        System.out.println(a.charAt(1));
        System.out.println(a.compareTo(b));
        System.out.println(a.endsWith(c));
        System.out.println(a.startsWith(c));
        System.out.println(a.indexOf(65,10));
        System.out.println(a.indexOf("mere"));
        System.out.println("BBB".length());
        System.out.println("".isEmpty());
        System.out.println("B".isBlank());
        System.out.println(a.replace('a','b'));
        System.out.println(a.substring (3,5));
        System.out.println(d.trim());
        System.out.println(getNrOfOccurances('e',a));
        System.out.println(rev("abc"));
        StringBuilder u=new StringBuilder();
        u.append("app").append("asada").append("asdasasdasa");
        System.out.println(u.toString());

    }

    public static int getNrOfOccurances(char c, String input) {
        int nr=0;
    for (int i=0; i < input.length(); i++){
        if(input.charAt(i)== c){
            nr++;
        }
    }
    return nr;}


public static String rev(String input){
    String result="";
    for(int i=input.length()-1;i>=0;i--){
        result=result+input.charAt(i);
    }
    return result;


    }

}


