/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author garima
 */
public class UserAccount {
    
    private String username;
    private String userPassword;
    private Employee employee;
    private Role userRole;
    private WorkQueue userWorkQueue;

    public UserAccount() {
        userWorkQueue = new WorkQueue();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return userPassword;
    }

    public void setPassword(String password) {
        this.userPassword = password;
    }

    public Role getRole() {
        return userRole;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.userRole = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return userWorkQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}