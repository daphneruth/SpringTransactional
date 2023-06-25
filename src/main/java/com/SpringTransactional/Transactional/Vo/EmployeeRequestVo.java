package com.SpringTransactional.Transactional.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequestVo {

    private  String empName;
    private  String empEmail;
    private  String departmentName;
}
