package com.example.SpingBootJPAP05.repository;

import com.example.SpingBootJPAP05.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository  //optional to write annoationbacouse i used the Crud Rposiotry
public interface StudentRepository extends CrudRepository <Student,Long> {



}
