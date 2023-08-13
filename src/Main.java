import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception 
    {
        InputStreamReader in= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(in);
        String input;
        int flag=0;
        while((input=br.readLine())!=null)
        {            
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
            System.out.print("\n");
        }              
    }
}
