package org.example.controller;



import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.example.dao.EmployeeDAO;
import org.example.modle.Employee;
import org.example.modle.Employee;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Path("/employees")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeController {

    EmployeeDAO dao = new EmployeeDAO();
    @GET
    public ArrayList<Employee> getAllEmployees(){
        try {
            return dao.selectAll();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }catch (ClassNotFoundException e){
            throw  new RuntimeException(e);
        }
    }
    @GET
    @Path("{employee_id}")
    public Employee getEmployee(@PathParam("employee_id") int employee_id){
        try {
            return dao.selectEmployee(employee_id);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }catch (ClassNotFoundException e){
            throw  new RuntimeException(e);
        }
    }







    @DELETE
    @Path("{employee_id}")
    public void deleteEmployee(@PathParam("employee_id")int employee_id){
        try {
            dao.deleteEmployee(employee_id);
        }catch (SQLException e){
            throw  new RuntimeException(e);
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
    @POST
    public void insertEmployee(Employee employee){
        try {
            dao.insertEmployee(employee);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }catch (ClassNotFoundException e){
            throw  new RuntimeException(e);
        }
    }

    @PUT
    @Path("{employee_id}")
    public  void updateEmployee(@PathParam("employee_id") int employee_id , Employee employee){
        try {
            employee.setEmployee_id(employee_id);
            dao.updateEmployee(employee);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }



}

