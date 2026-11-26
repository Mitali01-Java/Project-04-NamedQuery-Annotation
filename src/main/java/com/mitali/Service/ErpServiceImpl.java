package com.mitali.Service;

import com.mitali.Entity.ERP;
import com.mitali.Entity.Gender;
import com.mitali.Repository.ErpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ErpServiceImpl implements ErpService {

    @Autowired
    private ErpRepository erpRepository;


    @Override
    public List<ERP> getStudents(Gender gender) {
        return erpRepository.getStudentsByGender(gender);
    }

    @Override
    public ERP SaveStudents(ERP student) {
        return erpRepository.save(student);
    }
    //nn



}
