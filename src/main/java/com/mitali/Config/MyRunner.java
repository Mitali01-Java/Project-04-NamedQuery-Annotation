package com.mitali.Config;

import com.mitali.Entity.ERP;
import com.mitali.Entity.Gender;
import com.mitali.Service.ErpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRunner implements ApplicationRunner {

    @Autowired
    private ErpServiceImpl erpService;

    private static void printStudent(ERP e){
        System.out.println("Rno : " +e.getSid());
        System.out.println("Name : " + e.getName());
        System.out.println("Gender : " + e.getGender());
        System.out.println("percent : " +  e.getPercentage());
        System.out.println("--".repeat(25));
    }
    @Override
    public void run(ApplicationArguments args) throws Exception {

        // Use Case - Save Student
//
//        ERP e3 = new ERP(3,"CC", Gender.MALE,80.0);
//        ERP e4 = new ERP(4,"DD", Gender.FEMALE,84.0);
//
//        erpService.SaveStudents(e3);
//        erpService.SaveStudents(e4); mmmmmm

        List<ERP> erplist = erpService.getStudents();
        for (ERP e: erplist) {
            printStudent(e);
        }





    }
}
