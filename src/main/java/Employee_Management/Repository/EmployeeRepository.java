package Employee_Management.Repository;

import Employee_Management.Entity.Employee;
import org.hibernate.dialect.LobMergeStrategy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee ,Long> {


}
