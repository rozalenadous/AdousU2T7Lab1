import java.util.Scanner;
public class Int {
    public static void main(String []args){
       Scanner scan = new Scanner(System.in);

       // get the integer, print out its length, first half, and second half
        System.out.println("Enter First String: ");
        String str1 = scan.nextLine();
        //length
        System.out.println("String Length: " + str1.length());
        //first and second half
        int str1Half = str1.length()/2;
        if(str1Half % 2 != 0){
            str1Half +=1;
        }
System.out.println("First Half: " + str1.substring(0, str1Half));
        System.out.println("Second Half: " + str1.substring(str1Half));

        System.out.println("Enter Second String: ");
        String str2 = scan.nextLine();

        String longer = str1 + "is longer";
        if (str1.equals(str2)){
            longer = "both are the same length";
        }
        else if (str2.length()>str1.length()){
            longer = str2 + "is longer";
        }
        System.out.println(longer);

        //which is first alphabetically
        int alph = str1.compareTo(str2);
    if (alph < 0){
    System.out.println(str1 + " comes first alphabetically");
} else if (alph == 0){
        System.out.println("Both strings have the same exact characters");
    }
    else{
    System.out.println(str2 + " comes first alphabetically");
}

    int index = str1.indexOf(str2);
    if(index != -1){
        System.out.println(str2 + " is found in " + str1 + " at index " + index);
    } else {
        System.out.println(str2 + " is NOT found in " + str1);
    }
    }
}
