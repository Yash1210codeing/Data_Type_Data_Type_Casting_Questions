package Data_Type_Data_Type_Casting_Questions;
import java.util.*;
public class Data_Type_Casting_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
        int x1=-5;
        int i=428;
        byte b=(byte)(182);
        long l=10;
        short s=10;
        b=(byte)(i);       // Explicit       
        System.out.println(b);
        int a=90;
        byte b1=7;
        a=b1;
        System.out.println(a);
        long l1=1000000000l;
        Scanner sc=new Scanner(System.in);
        l1=sc.nextLong();       
        i=sc.nextInt();
        System.out.println(l1);
        System.out.println(i);
	}
}
