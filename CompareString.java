import java.util.*;
public class CompareString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }
        else if(name1.compareTo(name2)>0){
            System.out.println("S1>S2");
        }
        else{
            System.out.println("S2>S1");
        }
    }
}