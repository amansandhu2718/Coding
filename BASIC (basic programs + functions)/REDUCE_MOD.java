import java.util.Scanner;

public class Aman {
    public static void main(String[] args) {
       int lowerLimit=65;
       int upperelimit=90;
       int diff=(upperelimit-lowerLimit)+1; // length


       int n=91;

       int res=(n-lowerLimit)%diff;
       res=res+lowerLimit;
       System.out.println(""+(char)res);
    }
}
