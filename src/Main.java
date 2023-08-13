import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        int flag=0;
        char[] ch=input.toCharArray();

        for(char c:ch)
        {
            if(c=='"')
            {
                if(flag==0)
                {
                    System.out.print("``");
                    flag=1;
                }
                else
               {   
                    System.out.print("''");
                    flag=0;
                }     
            }
            else
            System.out.print(c);                         
        }         
    }
}
