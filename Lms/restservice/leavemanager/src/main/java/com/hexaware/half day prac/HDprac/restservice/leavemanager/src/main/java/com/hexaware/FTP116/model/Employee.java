package com.hexaware.FTP116.model;

import com.hexaware.FTP116.persistence.DbConnection;
import com.hexaware.FTP116.persistence.EmployeeDAO;
import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.List;
import java.util.Date;
/**
 * Employee class to store employee personal details.
 * @author hexware
 */
public class Employee {
  /**
   * empId to store employee id.
   * empFullName to store employee name.
   * empEmailId to store employee email id.
   * empMobileNo to store employee moblie no.
   * empdateOfJoining to store employee date of joining.
   * empDepartment to store employee department;
   * empLeaveBalance to store the employ leave balance.
   * empManagerId to store manager id
   */
  private int empId;
  private String empFullName;
  private String empMobileNo;
  private Date empDateOfJoining;

  private int empManagerId;
  private String empEmailId;
  private String empDepartment;
  private int empML;
  private int empPL;
  private int empEL;
  private String empDesignation;
/**
 * Default Constructer.
 */
  public Employee() {

  }


  @Override
  public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Employee emp = (Employee) obj;
    if (Objects.equals(empId, emp.empId)
        && Objects.equals(empFullName, emp.empFullName)
        && Objects.equals(empMobileNo, emp.empMobileNo)
        && Objects.equals(empDateOfJoining, emp.empDateOfJoining)
        && Objects.equals(empManagerId, emp.empManagerId)
        && Objects.equals(empEmailId, emp.empEmailId)
        && Objects.equals(empDepartment, emp.empDepartment)
        && Objects.equals(empML, emp.empML)
        && Objects.equals(empPL, emp.empPL)
        && Objects.equals(empEL, emp.empEL)
        && Objects.equals(empDesignation, emp.empDesignation)) {
      return true;
    }
    return false;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(empId, empFullName, empMobileNo, empDateOfJoining, empManagerId, empML, empPL, empEL,
                        empEmailId, empDepartment,empDesignation);
  }
  @Override
  public final String toString() {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dj = sdf.format(empDateOfJoining);
    return "empId:" + empId + " empFullName:" + empFullName + " empMobileNo:" + empMobileNo + " empDateOfJoining:"
          + dj + " empML:" + empML + "empPL:" + empPL + "empEL:" + empEL + "empManagerId:" + empManagerId
          + " empEmailId:" + empEmailId + " empDepartment:" + empDepartment + " empDesignation:" + empDesignation;
  }
  /**
   * @param argEmpId to initialize employee id.
   * @param argEmpFullName to initialize employee fullname.
   * @param argEmpEmailId to initialize employee email id.
   * @param argEmpMobileNo to initialize employee mobile no.
   * @param argEmpDateOfJoining to initialize employee date of joining.
   * @param argEmpDepartment to initialize employee department.
   * @param argEmpML to initialize employee leave balance.
   * @param argEmpPL to initialize employee leave balance.
   * @param argEmpEL to initialize employee leave balance.
   * @param argEmpManagerId to initialize employee manager id.
   * @param argEmpDesignation to initialize employee manager id.
   */
  public Employee(final int argEmpId, final String argEmpFullName, final String argEmpEmailId,
                  final String argEmpMobileNo, final Date argEmpDateOfJoining, final String argEmpDepartment,
                  final int argEmpML, final int argEmpPL, final int argEmpEL, final int argEmpManagerId, final String argEmpDesignation) {
    this.empId = argEmpId;
    this.empFullName = argEmpFullName;
    this.empEmailId = argEmpEmailId;
    this.empMobileNo = argEmpMobileNo;
    this.empDateOfJoining = argEmpDateOfJoining;
    this.empDepartment = argEmpDepartment;
    this.empML = argEmpML;
    this.empPL = argEmpPL;
    this.empEL = argEmpEL;
    this.empManagerId = argEmpManagerId;
    this.empDesignation = argEmpDesignation;
  }

  /**
   * Gets the EmployeeId.
   * @return this Employee's ID.
   */
  public final int getEmpId() {
    return empId;
  }
  /**
   *
   * @param argEmpId to set employee id.
   */
  public final void setEmpId(final int argEmpId) {
    this.empId = argEmpId;
  }
  /**
   * Gets the Employee Name.
   * @return this Employee's name.
   */
  public final String getEmpFullName() {
    return empFullName;
  }
  /**
   * @param argEmpFullName to set employee name.
   */
  public final void setEmpFullName(final String argEmpFullName) {
    this.empFullName = argEmpFullName;
  }
  /**
   * Gets the Employee email id.
   * @return this Employee's email id.
   */
  public final String getEmpEmailId() {
    return empEmailId;
  }

  /**
   * @param argEmpEmailId to set employee email id.
   */
  public final void setEmpEmailId(final String argEmpEmailId) {
    this.empEmailId = argEmpEmailId;
  }
  /**
   * gets the employee mobile no.
   * @return this employee's mobile no.
   */
  public final String getEmpMobileNo() {
    return empMobileNo;
  }
  /**
   * @param argEmpMobileNo to set employee mobile no.
   */
  public final void setEmpMobileNo(final String argEmpMobileNo) {
    this.empMobileNo = argEmpMobileNo;
  }
  /**
   * gets the employee date of joining.
   * @return this employee's date of joining.
   */
  public final Date getEmpDateOfJoining() {
    return empDateOfJoining;
  }
  /**
   * @param argEmpDateOfJoining to set employee date of joining.
   */
  public final void setEmpDateOfJoining(final Date argEmpDateOfJoining) {
    this.empDateOfJoining = argEmpDateOfJoining;
  }
  /**
   * gets the employee department.
   * @return this employee's department.
   */
  public final String getEmpDepartment() {
    return empDepartment;
  }
  /**
   * @param argEmpDepartment to set employee department.
   */
  public final void setEmpDepartment(final String argEmpDepartment) {
    this.empDepartment = argEmpDepartment;
  }
  /**
   * gets the employee leave details.
   * @return this employee's leave details.
   */
  public final int getEmpML() {
    return empML;
  }
  /**
   * @param argEmpML to set employee leave details.
   */
  public final void setEmpML(final int argEmpML) {
    this.empML = argEmpML;
  }

  /**
   * gets the employee leave details.
   * @return this employee's leave details.
   */
  public final int getEmpPL() {
    return empPL;
  }
  /**
   * @param argEmpPL to set employee leave details.
   */
  public final void setEmpPL(final int argEmpPL) {
    this.empPL = argEmpPL;
  }
  /**
   * gets the employee leave details.
   * @return this employee's leave details.
   */
  public final int getEmpEL() {
    return empEL;
  }
  /**
   * @param argEmpEL to set employee leave details.
   */
  public final void setEmpEL(final int argEmpEL) {
    this.empEL = argEmpEL;
  }
  /**
   * gets the employee manager id.
   * @return this employee's manager id.
   */
  public final int getEmpManagerId() {
    return empManagerId;
  }
  /**
   * @param argEmpManagerId to set employee's manager id.
   */
  public final void setEmpManagerId(final int argEmpManagerId) {
    this.empManagerId = argEmpManagerId;
  }
  
  public final String getEmpDesignation() {
    return empDesignation;
  }
  /**
   * @param argEmpDesignation to set employee's manager id.
   */
  public final void setEmpDesignation(final String argEmpDesignation) {
    this.empDesignation = argEmpDesignation;
  }
  /**
   * the dao for class employee.
   * @return employeedao.
   */
  public static EmployeeDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(EmployeeDAO.class);
  }
  /**
   * list all employee details.
   * @return all employees' details
   */
  public static Employee[] listAll() {
    List<Employee> es = dao().list();
    return es.toArray(new Employee[es.size()]);
  }
  /**
   * list employee details by id.
   * @param empID id to get employee details.
   * @return Employee
   */
  public static Employee listById(final int empID) {
    return dao().find(empID);
  }

}
