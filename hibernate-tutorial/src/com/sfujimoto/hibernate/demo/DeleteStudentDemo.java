package com.sfujimoto.hibernate.demo;

import com.sfujimoto.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by sfujimoto on 2017/03/14.
 */

public class DeleteStudentDemo {
    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                                    .configure("hibernate.cfg.xml")
                                    .addAnnotatedClass(Student.class)
                                    .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {
            int studentId = 1;

            // now get a new session and start transaction
            session = factory.getCurrentSession();
            session.beginTransaction();


            // retrieve student based on the id: primary key
            System.out.println("\nGetting student with id: " + studentId);

            Student myStudent = session.get(Student.class, studentId);

            // delete the student
            session.delete(myStudent);

            // commit the transaction
            session.getTransaction().commit();


            System.out.println("Done!!");
        }
        finally {
            factory.close();
        }


    }
}
