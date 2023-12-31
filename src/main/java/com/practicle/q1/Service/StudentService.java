package com.practicle.q1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practicle.q1.Model.Student;
import com.practicle.q1.Repository.StudentRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentService {
     @Autowired
    private StudentRepository repo;
     
    public List<Student> listAll() {
        return repo.findAll();
    }
     
    public void save(Student product) {
        repo.save(product);
    }
     
    public Student get(int id) {
        return repo.findById(id).get();
    }
     
    public void delete(int id) {
        repo.deleteById(id);
    }
}
