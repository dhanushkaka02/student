package com.example.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.student.entity.Student;
import java.util.List;


@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
    @Query(value = "select s from student s where s.name =?1")
    public Student findByName(String name);

}
