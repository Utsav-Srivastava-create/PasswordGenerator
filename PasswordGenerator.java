import java.util.*;
public class PasswordGenerator{

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("How many number do you want to generate : ");
    int total = sc.nextInt();
    System.out.println("How many charector do you want that your password will be :");

    int length = sc.nextInt();

    String[] randomPasswords = new String[total];

    for(int i = 0; i<total; i++){

        String randomPassword = "";     // Empty string for current password

        for(int j=0;j<length;j++){
            randomPassword = randomPassword + randomCharacter();   // Add random char

        }
        randomPasswords[i] = randomPassword;
    }
    printPasswords(randomPasswords);
    sc.close();


}

public static void printPasswords(String[] arr){
    for(int i= 0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}

public static char randomCharacter(){
    int rand = (int)(Math.random()*62);    // Random number 0-61 (62 total chars)
    if(rand <= 9){
        rand = rand+48;
        return (char)(rand);

    }
else if(rand <= 35){
    int ascii = rand + 55;
        return (char)(ascii);
}
    else{
        int ascii = rand + 61;
        return (char)(ascii);
        
    }
}
}
