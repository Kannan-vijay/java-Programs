import java.util.Scanner;

public class agevalidation {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = scan.nextInt();
        if(age<=18){
            System.out.println("you are an under age 18");
            if(age<=10){
                System.out.println("You are a child");
            }
            else{
                System.err.println("you are student");
            }
        }
            
        else{
            if(age>=35 && age>=60)
                {
                    System.out.println("you are senior citizen");
                
            if(age<35){
                System.out.println("you are empployee");
            }   
            }
            else{
                System.out.println("you are adult");
                
            }
        }
        scan.close();
        }
        
    }
    

