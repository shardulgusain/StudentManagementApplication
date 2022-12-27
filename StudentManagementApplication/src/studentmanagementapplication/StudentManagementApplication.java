
package studentmanagementapplication;

import com.student.manage.StudentDao;
import com.student.manage.Student;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author GUSAIN
 */
public class StudentManagementApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // TODO code application logic here
        while(true)
        {
            System.out.println("Press 1 to ADD student");
            System.out.println("Press 1 to DELETE student");
            System.out.println("Press 1 to DISPLAY student");
            System.out.println("Press 1 to DELETE student");
            System.out.println("Press 4 to Exit");
            int c = Integer.parseInt(br.readLine());
            if(c==1)
            {
                System.out.println("Enter Name"); 
                String name = br.readLine();
                System.out.println("Enter Phone"); 
                String phone = br.readLine();
                System.out.println("Enter City"); 
                String city = br.readLine();
                Student st = new Student(name,phone,city);
                boolean answer = StudentDao.insertStudentToDB(st);
                if(answer==true)
                {
                    System.out.println("Success");
                }
                else{
                    System.out.println("Failed");
                }
            }
            else if(c==2)
            {
                
            }
            else if(c==3)
            {
                
            }
            else if(c==4)
            {}
            else if(c==5)
            {
                
            }
            else
            {
                
            }
                
            
        }
    }
    
}
