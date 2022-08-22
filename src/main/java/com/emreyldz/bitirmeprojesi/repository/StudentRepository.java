package com.emreyldz.bitirmeprojesi.repository;

import com.emreyldz.bitirmeprojesi.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>
{
}
