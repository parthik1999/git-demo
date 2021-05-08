import java.util.*;

public class ArrayException
{
    public String getPriceDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int no_of_element = sc.nextInt();
        int input[] = new int[no_of_element];
        int output=0;
        try 
        {
            System.out.println("Enter the price details");
            for(int i=0;i<no_of_element;i++)
                {
                    input[i] = sc.nextInt();
                }   
                
            System.out.println("Enter the index of the array element you want to access");
            int index = sc.nextInt();
            output = input[index];
            
        } 
        catch(ArrayIndexOutOfBoundsException e) {
            return "Array index is out of range";
        } 
        catch(InputMismatchException e)
        {
            return "Input was not in the correct format";
        }
        
        return "The array element is "+output;
        
    }
    public static void main (String[] args) {
        ArrayException ae = new ArrayException();
        System.out.println(ae.getPriceDetails());
    }
}