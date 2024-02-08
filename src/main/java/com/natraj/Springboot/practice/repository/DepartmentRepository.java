package com.natraj.Springboot.practice.repository;

import com.natraj.Springboot.practice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // by adding this annotation we make sure that all these classes will be in @component which means
//all the classes which we are created are in the radar of spring now so when ever spring application starts
//all the objects for these classes will be created and added to the spring container so whenever we want
// we can  tell spring i want this particular class so we can use it directly
//Instead of creating our own class rather we will be  extending the Jpa repository itself because jpa repository
//gives us lot of different methods we can use directly to interact entity with our database
//after extending we have to pass our entity and primary key type
public interface DepartmentRepository extends JpaRepository<Department, Long>{
}
