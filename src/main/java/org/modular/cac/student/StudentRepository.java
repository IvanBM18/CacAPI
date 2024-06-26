package org.modular.cac.student;

import org.modular.cac.models.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student,Long>, CrudRepository<Student,Long> {


    @Query("Select s from Student s WHERE s.siiauCode = ?1")
    Optional<Student> findBySiiauCode(String code);
}
