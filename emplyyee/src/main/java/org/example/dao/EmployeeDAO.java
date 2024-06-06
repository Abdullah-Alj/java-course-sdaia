package org.example.dao;




import org.example.modle.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class EmployeeDAO {
    private static final String url = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\project-02\\src\\main\\java\\day4\\hr.db";
    private static final String SELECT_ALL_employees = "select * from employees";
    private static final String SELECT_ONE_employee = "select * from employees where employee_id = ?";
    private static final String INSERT_employee = "insert into employees values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String UPDATE_employee = "update employees set first_name = ?, last_name = ?, email = ?, " +
            "phone_number = ?, hire_date = ?, job_id = ?, salary = ?, manager_id = ?, department_id = ? where employee_id = ?";
    private static final String DELETE_employee = "delete from employees where employee_id = ?";

    //private static final String SELECT_JOB_WITH_min_salary = "select * from jobs where main_salary = ? order by job_id limit ? offset ?";
   // private static final String SELECT_JOB_WITH_max_salary = "select * from jobs order by job limit ? offset ?";

    public void insertEmployee(Employee employee) throws SQLException, ClassCastException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        try (Connection connection = DriverManager.getConnection(url);
             PreparedStatement st = connection.prepareStatement(INSERT_employee)){
            st.setInt(1,employee.getEmployee_id());
            st.setString(2,employee.getFirst_name());
            st.setString(3,employee.getLast_name());
            st.setString(4,employee.getEmail());
            st.setString(5,employee.getPhone_number());
            st.setString(6,employee.getHire_date());
            st.setInt(7,employee.getJob_id());
            st.setDouble(8,employee.getSalary());
            st.setInt(9,employee.getManager_id());
            st.setInt(10,employee.getEmployee_id());

        }
    }
    public void updateEmployee (Employee employee) throws SQLException ,ClassNotFoundException{
        Class.forName("org.sqlite.JDBC");
        try (Connection connection = DriverManager.getConnection(url);
             PreparedStatement st = connection.prepareStatement(UPDATE_employee)){
            st.setInt(1,employee.getEmployee_id());
            st.setString(2,employee.getFirst_name());
            st.setString(3,employee.getLast_name());
            st.setString(4,employee.getEmail());
            st.setString(5,employee.getPhone_number());
            st.setString(6,employee.getHire_date());
            st.setInt(7,employee.getJob_id());
            st.setDouble(8,employee.getSalary());
            st.setInt(9,employee.getManager_id());
            st.setInt(10,employee.getEmployee_id());
            st.executeUpdate();

        }
    }
    public void deleteEmployee (int employee_id ) throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        try (Connection connection = DriverManager.getConnection(url);
             PreparedStatement st = connection.prepareStatement(DELETE_employee)) {
            st.setInt(1, employee_id);
            st.executeUpdate();
        }
    }
    public ArrayList<Employee> selectAll() throws SQLException, ClassNotFoundException{
        Class.forName("org.sqlite.JDBC");
        try (Connection connection = DriverManager.getConnection(url);
             PreparedStatement st = connection.prepareStatement(SELECT_ALL_employees);
             ResultSet rs = st.executeQuery()) {
            ArrayList<Employee> employees = new ArrayList<>();
            while (rs.next()){
                employees.add(new Employee(rs));
            }
            return employees;
        }
    }
    public Employee selectEmployee(int employee_id) throws  SQLException,ClassNotFoundException{
        Class.forName("org.sqlite.JDBC");
        try (Connection connection = DriverManager.getConnection(url);
             PreparedStatement st = connection.prepareStatement(SELECT_ONE_employee)){
            st.setInt(1,employee_id);
            try (ResultSet rs = st.executeQuery()){
                if (rs.next()){
                  return new Employee(rs);
                }

            }
        }
        return null;
    }

    public void addLink(String string, String self) {
    }
}
