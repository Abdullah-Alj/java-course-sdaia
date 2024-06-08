package org.example.controller;



import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import org.example.dao.EmployeeDAO;
import org.example.dto.EmployeeDto;
import org.example.dto.JobDto;
import org.example.modle.Employee;
import org.example.modle.Employee;
import org.example.modle.Job;


import java.net.URI;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;

@Path("/employees")
//@Produces(MediaType.APPLICATION_JSON)
//@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeController {

    EmployeeDAO dao = new EmployeeDAO();
    @Context
    UriInfo uriInfo;
    @Context
    HttpHeaders headers;

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response getAllEmployee() {

        try {
            GenericEntity<ArrayList<Employee>> employee = new GenericEntity<ArrayList<Employee>>(dao.selectAll()) {
            };
            if (headers.getAcceptableMediaTypes().contains(MediaType.valueOf(MediaType.APPLICATION_XML))) {
                return Response
                        .ok(employee)
                        .type(MediaType.APPLICATION_XML)
                        .build();
            }
            if (headers.getAcceptableMediaTypes().contains(MediaType.valueOf("text/csv"))) {
                return Response
                        .ok(employee)
                        .type("text/csv")
                        .build();
            }
            return Response.ok(employee, MediaType.APPLICATION_JSON).build();
            // return dao.selectAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @POST
    @Consumes(MediaType.APPLICATION_XML)
    public Response insertEmployee(Employee employees){
        try {
            dao.insertEmployee(employees);
            NewCookie cookie = (new NewCookie.Builder("username").value("abdullah").build());
            URI uri = uriInfo.getAbsolutePathBuilder().path(employees.getJob_id() + "").build();
            return Response
                    .created(uri)
                    .cookie(cookie)
                    .header("Created by", "abdullah")
                    .build();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @POST
    @Consumes(MediaType.APPLICATION_XML)

    public Response insertEmployeeFromForm(@BeanParam Employee employee) {
        try {
            dao.insertEmployee(employee);
            NewCookie cookie = (new NewCookie.Builder("username")).value("abdullah").build();
            URI uri = uriInfo.getAbsolutePathBuilder().path(employee.getJob_id() + " ").build();
            return Response.created(uri).cookie(cookie).header("Created by", "Wael").build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PUT
    @Path("{employee_id}")
    public Response updateEmployee(@PathParam("employee_id") int employee_id, Employee employee) {
        try {
            dao.updateEmployee(employee);
            NewCookie cookie = (new NewCookie.Builder("username").value("abdullah").build());
            URI uri = uriInfo.getAbsolutePathBuilder().path(employee.getJob_id() + "").build();
            return Response
                    .created(uri)
                    .cookie(cookie)
                    .header("Created by", "abdullah")
                    .build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @DELETE
    @Path("{employee_id}")
    public Response deleteEmployee(@PathParam("employee_id") int employee_id, Employee employee) {
        try {
            dao.deleteEmployee(employee_id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @GET
    @Path("{employee_id}")
    public Response getEmployee(@PathParam("employee_id") int employee_id) throws SQLException {
        try {
            Employee employee = dao.selectEmployee(employee_id);
            if (employee == null) {
                throw new DataFormatException("Employee" + employee_id + "not found");
            }
            EmployeeDto dto = new EmployeeDto();
            dto.setEmployee_id(employee.getEmployee_id());
            dto.setFirst_name(employee.getFirst_name());
            dto.setLast_name(employee.getLast_name());
            dto.setEmail(employee.getEmail());
            dto.setPhone_number(employee.getPhone_number());
            dto.setHire_date(employee.getHire_date());
            dto.setJob_id(employee.getJob_id());
            dto.setSalary(employee.getSalary());
            dto.setManager_id(employee.getManager_id());
            dto.setEmployee_id(employee.getDepartment_id());

            return Response.ok(dto).build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void addLinks(EmployeeDAO dto) {
        URI setFUri = uriInfo.getAbsolutePath();
        URI empsUri = uriInfo.getAbsolutePathBuilder().path(JobController.class).build();
        dto.addLink(setFUri.toString(), "self");
        dto.addLink(empsUri.toString(), "job");

    }

    public JobController getJobController (){
        return new JobController();
    }


}




