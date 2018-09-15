/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;
import java.io.DataInputStream;
/**
 *
 * @author Arijit
 */
public class Linearsearch {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{
        int i,n=0,search;
        DataInputStream in= new DataInputStream(System.in);
        System.out.println("\nEnter The Size Of Array:");
        n=Integer.parseInt(in.readLine());
        int x[]=new int[n];
        System.out.println("\nEnter The Value Of Array:");
        for(i=0;i<n;i++)
            x[i]=Integer.parseInt(in.readLine());
        System.out.println("\nEnter The Value you want to search:");
        search=Integer.parseInt(in.readLine());
        for(i=0;i<n;i++)
        {
            if(x[i]==search)
                System.out.println("\nElement Found");
            else
                System.out.println("\nElement Not Found");
        }
    }
    
}
