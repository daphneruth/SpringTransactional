package com.SpringTransactional.Transactional.Service;

import com.SpringTransactional.Transactional.Entity.Department;
import com.SpringTransactional.Transactional.Entity.Employee;
import com.SpringTransactional.Transactional.Repository.DepartmentRepo;
import com.SpringTransactional.Transactional.Repository.EmployeeRepo;
import com.SpringTransactional.Transactional.Vo.EmployeeRequestVo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private DepartmentRepo departmentRepo;

    @Transactional
    public String saveEmployee(EmployeeRequestVo employeeRequestVo) {
        Department department =new Department();
        department.setDeparmentName(employeeRequestVo.getDepartmentName());
        department.setDeparmentCode(employeeRequestVo.getDepartmentName());

        Long departmentId =departmentRepo.save(department).getDepartmentId();

        Employee employee =new Employee();
        employee.setEmpName(employeeRequestVo.getEmpName());
        employee.setEmpEmail(employeeRequestVo.getEmpEmail());
        employee.setDepartmentName(String.valueOf(departmentId));

        employeeRepo.save(employee);
        return "employee with ID"+ employee.getId();
    }
}
