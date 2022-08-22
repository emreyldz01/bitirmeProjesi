package com.emreyldz.bitirmeprojesi;

import com.emreyldz.bitirmeprojesi.entity.Student;
import com.emreyldz.bitirmeprojesi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BitirmeProjesiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BitirmeProjesiApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {

    }
}
