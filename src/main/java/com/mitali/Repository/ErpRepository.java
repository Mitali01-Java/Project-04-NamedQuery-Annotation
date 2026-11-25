package com.mitali.Repository;

import com.mitali.Entity.ERP;
import com.mitali.Entity.Gender;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ErpRepository extends CrudRepository<ERP,Integer> {

    @Query(name = "ERP.getMaleStudents")
    List<ERP> getStudentsByGender(
            @Param("gender") Gender gender
    );
}
