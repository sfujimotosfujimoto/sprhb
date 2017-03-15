package com.sfujimoto.hibernate.demo;

import com.sfujimoto.hibernate.demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by sfujimoto on 2017/03/14.
 */

public class DeleteEmployeeDemo {
    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                                    .configure("hibernate.cfg.xml")
                                    .addAnnotatedClass(Employee.class)
                                    .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            int employeeId = 1;

            // now get a new session and start transaction
            session = factory.getCurrentSession();
            session.beginTransaction();


            // retrieve employee based on the id: primary key
            System.out.println("\nGetting employee with id: " + employeeId);

            Employee myEmployee = session.get(Employee.class, employeeId);

            // delete the employeeId
//            System.out.println("Deleting student: " + myEmployee);
//            session.delete(myEmployee);

            // delete student id
            System.out.println("Deleting employee id=2");
            session.createQuery("delete from Employee where id=2").executeUpdate();

            // commit the transaction
            session.getTransaction().commit();


            System.out.println("Done!!");
        }
        finally {
            factory.close();
        }


    }
}
