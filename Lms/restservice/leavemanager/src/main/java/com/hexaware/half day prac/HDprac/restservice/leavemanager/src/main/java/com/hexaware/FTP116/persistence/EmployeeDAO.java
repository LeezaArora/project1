package com.hexaware.FTP116.persistence;

import com.hexaware.FTP116.model.Employee;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import java.util.List;

/**
 * The DAO class for employee.
 */
public interface EmployeeDAO  {
  /**
   * return all the details of all the employees.
   * @return the employee array
   */
  @SqlQuery("SELECT * FROM EMPLOYEDETAILS")
  @Mapper(EmployeeMapper.class)
  List<Employee> list();

  /**
   * return all the details of the selected employee.
   * @param empID the id of the employee
   * @return the employee object
   */
  @SqlQuery("SELECT * FROM EMPLOYEDETAILS WHERE EMP_ID = :empID")
  @Mapper(EmployeeMapper.class)
  Employee find(@Bind("empID") int empID);

  
  /**
   * return all the details of the selected employee.
   * @param empID the id of the employee
   * @return the employee object
   */
  @SqlQuery("SELECT * FROM EMPLOYEDETAILS WHERE EMP_DEPARTMENT = 'INOVATION' AND EMP_DESIGNATION = 'HR MANAGER'")
  @Mapper(EmployeeMapper.class)
  Employee findHr();

  /**
   * update leave balance of the employee.
   * @param empID to update leave balance of employee.
   * @param updBal is to get employee id.
   */
  @SqlUpdate("UPDATE EMPLOYEDETAILS SET EMP_ML = :updBal WHERE EMP_ID = :empID")
  void updateML(@Bind("empID") int empID,
                 @Bind("updBal") int updBal);
  /**
   * update leave balance of the employee.
   * @param empID to update leave balance of employee.
   * @param updBal is to get employee id.
   */
  @SqlUpdate("UPDATE EMPLOYEDETAILS SET EMP_PL = :updBal WHERE EMP_ID = :empID")
  void updatePL (@Bind("empID") int empID,
                @Bind("updBal") int updBal);
  /**
   * update leave balance of the employee.
   * @param empID to update leave balance of employee.
   * @param updBal is to get employee id.
   */
  @SqlUpdate("UPDATE EMPLOYEDETAILS SET EMP_EL = :updBal WHERE EMP_ID = :empID")
  void updateEL (@Bind("empID") int empID,
                @Bind("updBal") int updBal);
  /**
  * close with no args is used to close the connection.
  */
  void close();
}
