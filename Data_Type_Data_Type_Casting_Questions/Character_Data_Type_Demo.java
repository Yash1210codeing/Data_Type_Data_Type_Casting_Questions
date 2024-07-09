package Data_Type_Data_Type_Casting_Questions;
import java.util.*;
public class Character_Data_Type_Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch4='a';
		char ch5='b';
        char ch='a';
        char ch1='0';
        char c=':';
        char ch2=';';
        Scanner Sc=new Scanner(System.in);
        ch4=Sc.next().charAt(0); // input
        System.out.println(ch);
        System.out.println(ch1);
        System.out.println((int)(ch));
        System.out.println((int)(ch1));
        System.out.println(ch+ch1); 
        int x=19;
        x++;  // (int)(x+1)   // Implicit
        ch++;  // ch=(char)(ch+1)   //Implicit
        System.out.println(ch);
        ch=(char)(ch+1);        //Explicit
        ch+=1;  // ch=(char) (ch+1);//Implicit
        System.out.println(ch);
        
	}
}
