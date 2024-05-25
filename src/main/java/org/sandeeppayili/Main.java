package org.sandeeppayili;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Doctor doctor = new Doctor();
//        doctor.assist();

//        Doctor doctor = context.getBean(Doctor.class);
//        doctor.assist();

//        Nurse nurse = context.getBean(Nurse.class);
//        nurse.assist();

//        Nurse nurse = (Nurse) context.getBean("nurse"); // we can get bean by it's id as well instead of type.
//        nurse.assist();

//        Staff staff = context.getBean(Nurse.class);
//        staff.assist();

//        Doctor staff = context.getBean(Doctor.class);
//        System.out.println("SPXXX :: staff qualification :: "+staff.getQualification());
//        staff.getNurse().assist();

        Staff staff = context.getBean(Nurse.class);
        staff.assist();

    }

}