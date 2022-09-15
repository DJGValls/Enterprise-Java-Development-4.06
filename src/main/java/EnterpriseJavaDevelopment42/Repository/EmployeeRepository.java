package EnterpriseJavaDevelopment42.Repository;

import EnterpriseJavaDevelopment42.Model.Employee;
import EnterpriseJavaDevelopment42.Model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findAllByStatus(Status status);

    List<Employee> findAllByDepartment(String department);
}
