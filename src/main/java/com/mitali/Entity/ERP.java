package com.mitali.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NamedQuery(
        name ="ERP.getMaleStudents",
        query = "SELECT e FROM ERP e WHERE e.gender =:gender"
)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ERP {
    @Id
    private Integer sid;
    private String name;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Double percentage;

}
