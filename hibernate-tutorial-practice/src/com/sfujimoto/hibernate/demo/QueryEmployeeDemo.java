package com.sfujimoto.hibernate.demo;

import com.sfujimoto.hibernate.demo.entity.Employee;
import com.sfujimoto.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Created by sfujimoto on 2017/03/14.
 */

public class QueryEmployeeDemo {
    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                                    .configure("hibernate.cfg.xml")
                                    .addAnnotatedClass(Employee.class)
                                    .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {

            // start a transaction
            session.beginTransaction();

            // query students
            List<Employee> theEmployees = session.createQuery("from Employee").getResultList();

            // display the students
            displayEmployees(theEmployees);

            // query students: lastName='Doe'
            theEmployees = session.createQuery("from Employee s where s.lastName='Doe'").getResultList();

            // display the students
            System.out.println("\nEmployy who have last name of Doe or first name of Daffy");
            displayEmployees(theEmployees);

            // query students: lastName='Doe' OR firstName='Daffy'
            theEmployees = session.createQuery("from Employee s where" +
                    " s.lastName='Doe' OR s.firstName='Mary'").getResultList();


            // display the students
            System.out.println("\nEmployee who have last name of Doe");
            displayEmployees(theEmployees);


            // query students: where email LIKE '%luv2code.com'
            theEmployees = session.createQuery("from Employee s where" +
                    " s.company LIKE '%xt'").getResultList();


            // display the students
            System.out.println("\nemail ends with luv2code.com");
            displayEmployees(theEmployees);




            // commit transaction
            session.getTransaction().commit();

            System.out.println("Done!!");

        }
        finally {
            factory.close();
        }


    }

    private static void displayEmployees(List<Employee> theEmployees) {
        for (Employee tempEmployee : theEmployees) {
            System.out.println(tempEmployee);
        }
    }
}
