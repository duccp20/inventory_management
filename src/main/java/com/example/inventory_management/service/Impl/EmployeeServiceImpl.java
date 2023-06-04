//package com.example.inventory_management.service.Impl;
//
//import com.example.inventory_management.model.entity.EmployeeEntity;
//import com.example.inventory_management.repository.EmployeeRepository;
//import com.example.inventory_management.service.EmployeeService;
//import jakarta.transaction.Transactional;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//    private EmployeeRepository employeeRepository;
//
//
//    public EmployeeEntity addEmployee(EmployeeEntity employee) {
//        return employeeRepository.save(employee);
//    }
//
//
//    public EmployeeEntity updateEmployee(String id, EmployeeEntity employee) {
//        if (employee != null) {
//            EmployeeEntity employee1 = employeeRepository.getById(id);
//            if (employee1 != null) {
//                employee1.setFirstName(employee.getFirstName());
//                employee1.setLastName(employee.getLastName());
//                employee1.setEmail(employee.getEmail());
//                employee1.setPhone(employee.getPhone());
//                employee1.setBirthDay(employee.getBirthDay());
//                employee1.setStartWorking(employee.getStartWorking());
//                employee1.setEndWorking(employee.getEndWorking());
//                employee1.setManagerID(employee.getManagerID());
//
//                return employeeRepository.save(employee1);
//            }
//        }
//        return null;
//    }
//
//    public void deleteEmployee(String id) {
//        employeeRepository.deleteById(id);
//    }
//
//    public List<EmployeeEntity> getAllEmployee() {
//        return employeeRepository.findAll();
//    }
//
//    public EmployeeEntity getOneEmployee(String id) {
//        return employeeRepository.getById(id);
//    }
//}
