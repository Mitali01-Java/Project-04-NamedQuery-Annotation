package com.mitali.Service;

import com.mitali.Entity.ERP;
import com.mitali.Entity.Gender;

import java.util.List;

public interface ErpService {

    public List<ERP> getStudents();

    public ERP SaveStudents(ERP student);
}
