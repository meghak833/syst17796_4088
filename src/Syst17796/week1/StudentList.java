
package Syst17796.week1;

import java.util.Scanner;

/**
 *
 * @author Megha Patel
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
//        Student s1=new Student();
//        
//        s1.setName("Megha");
//        System.out.println("name: "+ s1.getName());
//        
        Student[] s=new Student[2];
        
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<=s.length-1;i++)
        {
            s[i]=new Student();
            System.out.println("Enter id: ");
            s[i].setId(scan.nextInt());
            System.out.println("hello");
        
        }
        
        
        
       // s[1]=s1;
        
        
        
    
    
    
    }
    
    
    

}
