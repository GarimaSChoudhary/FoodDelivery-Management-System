/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author garima
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountDirectory;

    public UserAccountDirectory() {
        userAccountDirectory = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountDirectory)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountDirectory.add(userAccount);
        return userAccount;
    }
    
    public UserAccount getUserByEmployeeId(String id){
        for(UserAccount user: userAccountDirectory){
            if(user.getEmployee().getName().equalsIgnoreCase(id)){
                return user;
            }
        }
        return null;
    }
    
    public void removeAllAccounts(){
        for(int i =0 ; i< userAccountDirectory.size();i++)
            if(!userAccountDirectory.get(i).getUsername().equalsIgnoreCase("sysadmin"))
                userAccountDirectory.remove(i);
        
        for(int i =0 ; i< userAccountDirectory.size();i++)
            System.out.println(userAccountDirectory.get(i).getEmployee());
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountDirectory){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
