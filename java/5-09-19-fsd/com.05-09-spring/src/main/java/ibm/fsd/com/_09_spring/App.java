package ibm.fsd.com._09_spring;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configjava.sportConfig;

import ibm.fsd.com.thecoach.EmployeeDAO;
import ibm.fsd.com.thecoachInterface.Coach;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context=new  AnnotationConfigApplicationContext(sportConfig.class);
        Coach c= (Coach) context.getBean("theemployee",EmployeeDAO.class);
        System.out.println("main ..");
    }
}
