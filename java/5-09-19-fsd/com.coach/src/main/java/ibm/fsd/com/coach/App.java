package ibm.fsd.com.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ibm.fsd.com.thecoach.BaseBallCoach;
import ibm.fsd.com.thecoach.employee;
import ibm.fsd.com.thecoachInterface.Coach;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext1.xml");
//       Coach myCoach=context.getBean("theCoach",BaseBallCoach.class);
//    	System.out.println(myCoach.getDailyWorkout());
        
//     Coach theCoach=context.getBean("theCoach",Coach.class);
//    	System.out.println(theCoach.getDailyWorkout()+" "+theCoach.getDailyFortune());
        
        
//        employee e=context.getBean("theemployee",employee.class);
//        System.out.println(e.toString());
        
        EmployeeDAO dao=context.getBean("eDao",EmployeeDAO.class);
        dao.createEmployee(new employee(9,"Sourav","ganguly","sr@gg.com"));
        System.out.println(dao.getAllEmployee().toString());
    }
}
