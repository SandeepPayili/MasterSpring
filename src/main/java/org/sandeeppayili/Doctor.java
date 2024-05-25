package org.sandeeppayili;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {

//    public Doctor(String qualification) {
//        this.qualification = qualification;
//    }

    private String qualification;

//    public Nurse getNurse() {
//        return nurse;

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }
//    }
//
//    public void setNurse(Nurse nurse) {
//        this.nurse = nurse;
//    }
//
//    private Nurse nurse;

    public void assist(){
        System.out.println("Doctor is Assisting..............");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("SPXXX :: inside function setBeanName");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("SPXXX :: inside post construct method ::: ");
    }
}
