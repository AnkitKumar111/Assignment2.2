/*program to print the following pattern:
     a
   a b a
 a b c b a
   a b a
     a
*/
import java.util.Scanner;
public class pattern {	
	public static void print(){ 
		//creating object for scanner class
		Scanner sc = new Scanner(System.in);
		//taking input form user using object of scanner class
        System.out.println("Input the number: ");  
        int n = sc.nextInt();
        int count = 1;  
        int count2 = 1;  
        char c = 'a';  
  
        for (int i = 1; i < (n * 2); i++)   
        {  
            for (int spc = n - count2; spc > 0; spc--)     
            //print space  
            {  
                System.out.print(" ");  
            }  
            if (i < n)   
            {  
                count2++;  
            }   
            else   
            {  
                count2--;  
            }  
            for (int j = 0; j < count; j++)   
            {  
                System.out.print(c);//print Character  
                if (j < count / 2)   
                {  
                    c++;  
                } else   
                {  
                    c--;  
                }  
            }  
            if (i < n)  
            {  
                count = count + 2;  
            }   
            else  
            {  
                count = count - 2;  
            }  
            c = 'a';  
  
            System.out.println();  
        }  
    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern obj = new pattern();		
		obj.print();

			}
}