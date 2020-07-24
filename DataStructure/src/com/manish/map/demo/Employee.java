/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manish.map.demo;

/**
 *
 * @author 1576202
 */
public class Employee  {
    
    private int employeeId;
    private String EmployeName;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeName() {
        return EmployeName;
    }

    public void setEmployeName(String EmployeName) {
        this.EmployeName = EmployeName;
    }

    public Employee(int employeeId, String EmployeName) {
        this.employeeId = employeeId;
        this.EmployeName = EmployeName;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + ", EmployeName=" + EmployeName + '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.employeeId != other.employeeId) {
            return false;
        }
        return true;
    }
    
    

    
    
    
       
}
