import java.util.Scanner;

public class problem4
{  
    public static void main(String[] args) 
     {  Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string:");
        String str1 = sc.nextLine();
        int count;  
        System.out.println("The entered string is: "+str1);  
        char str[] = str1.toCharArray();  
          
        System.out.println("Duplicate characters in a given string: ");
        for(int i = 0; i <str.length; i++) 
        {  
            count = 1;  
            for(int j = i+1; j <str.length; j++) 
            {  
                if(str[i] == str[j] && str[i] != ' ') 
                {  
                    count++;   
                    str[j] = '0';  
                }  
            }   
            if(count > 1 && str[i] != '0')  
                System.out.println(str[i]);  
        }  
    }  
}  
