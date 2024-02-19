package com.natraj.Springboot.practice.controller;

import com.natraj.Springboot.practice.entity.Department;
import com.natraj.Springboot.practice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//by adding this it will behave like a rest controller now we can create rest API
public class DepartmentController {
    @Autowired //we tell spring by this annotation that autowired is a particular object that you have in a spring container
    // this autowired will attach the object to this below reference variable that we have created
    private DepartmentService dpartmentservice; //spring does not understand we have to tell spring by
    //annotation autowired that this object i want it from you

    //creating methods for our controller
    //creating method to save department
    @PostMapping("/Departments")//calling this post with departments
    //we are creating rest api using postmapping, doing post request from any of the rest client, we will be
    //passing the request body as well, whatever request we are getting  that will be the entire json object now we
    // have to convert that json object to department entity

    //defining what we want as input
    //now whatever jason data that we are passing has to be converted to this department java object for that we add
    //requestbody annotation so we are telling spring that whatever jason data you are getting as a request
    //body get that json and convert it to department java object that we defined below

    public Department saveDepartment(@RequestBody Department department)
    // now we have to call tha service layer
    //to pass this data from service layer we do business logic after that we can call the repository layer
    //to save the particular data over there

    {
        return dpartmentservice.saveDepartment(department);
        // DepartmentService service = new DepartmentServiceImpL();  but we don't need to create object
        //like this because we are using spring it already knows we are using this classes and it will
        //automatically create objects for us for that we need to say spring at class layer that i want
        //this particular object refer line 13.
    }
    @GetMapping("/Departments")
    public List<Department> fetchDepartmentList(){
        return dpartmentservice.fetchDepartmentList();
    }
    @GetMapping("/Departments/{id}")//now whenever we are calling this particular /departments i
    //want to pass a particular department Id which i want to get the data this particular part will
    //be dynamic because we can send any of the Id over here this is call path variable
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId)// we have to get this
    //particular id what we have defined over above line (47)as a input parameter to our method as well for that
    // we add long departmentId now we have to map this particular Id with departmentId for that
    // we annotate this with pathvariable as written above line(50)
    {
        return dpartmentservice.fetchDepartmentById(departmentId);
    }
    @DeleteMapping("/Departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        dpartmentservice.deleteDepartmentById(departmentId);
        return "Department deleted successfully";
    }

}
