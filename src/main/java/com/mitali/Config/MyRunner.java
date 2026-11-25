package com.mitali.Config;

import com.mitali.Entity.ERP;
import com.mitali.Entity.Gender;
import com.mitali.Service.ErpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

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

        ERP e1 = new ERP(1,"AA", Gender.MALE,90.0);
        ERP e2 = new ERP(2,"BB", Gender.FEMALE,94.0);

        erpService.SaveStudents(e1);
        erpService.SaveStudents(e2);



    }
}
