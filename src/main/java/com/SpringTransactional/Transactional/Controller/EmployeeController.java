package com.SpringTransactional.Transactional.Controller;


import com.SpringTransactional.Transactional.Service.EmployeeService;
import com.SpringTransactional.Transactional.Vo.EmployeeRequestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
@PostMapping("/employee")
    public String saveEmployee(@RequestBody EmployeeRequestVo employeeRequestVo){
    return employeeService.saveEmployee(employeeRequestVo);
}
}
