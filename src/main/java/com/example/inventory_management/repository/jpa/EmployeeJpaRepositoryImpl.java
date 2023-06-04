//package com.example.inventory_management.repository.jpa;
//
//import com.example.inventory_management.model.entity.EmployeeEntity;
//import com.example.inventory_management.repository.EmployeeRepository;
//import jakarta.transaction.Transactional;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.Optional;
//
////thao tac vs sql
//
//@Component //la 1 bean
//public class EmployeeJpaRepositoryImpl {
//
//    private final EmployeeRepository employeeRepository;
//
//    public EmployeeJpaRepositoryImpl(@Lazy EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }
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
//    @Transactional
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
//
//}
