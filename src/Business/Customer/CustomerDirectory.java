/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author garima
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerDirectory;
    
    public CustomerDirectory(){
        customerDirectory = new ArrayList<Customer>();
//        Customer customer1 = new Customer("C1", "Dhankuwar Sisodiya", "9096099020", "171 Hemenway Street, Boston");
//        customerDirectory.add(customer1);
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public void deleteCustomer(int index,EcoSystem system){
        String id = customerDirectory.get(index).getCustomerId();
        for(int i =0; i <system.getUserAccountDirectory().getUserAccountDirectory().size();i++){
            if(system.getUserAccountDirectory().getUserAccountDirectory().get(i).getEmployee().getName().equalsIgnoreCase(id)){
                system.getUserAccountDirectory().getUserAccountDirectory().remove(i);
            }
        }
        customerDirectory.remove(index);
    }
    
    public Customer addCustomer(String name, String phone, String address){
        Customer customer1 = new Customer("C"+(customerDirectory.size()+1),name,phone,address);
        customerDirectory.add(customer1);
        return customer1;
    }
    
    public Customer getCustomerId(int index){
        return customerDirectory.get(index);
    }
    
    public void updateCustomer(String id,String name,String phone,String address){
        for(Customer customer: customerDirectory){
            if(customer.getCustomerId().equalsIgnoreCase(id)){
                customer.setCustomerName(name);
                customer.setCustomerPhoneNo(phone);
                customer.setCustomerAddress(address);
            }
        }
    }
    
    public boolean isPhoneUnique(String phone){
        for(Customer customer: customerDirectory){
            if(customer.getCustomerPhoneNo().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
    
    public Customer getCustomer(String id){
        for(Customer customer: customerDirectory){
            if(customer.getCustomerId().equalsIgnoreCase(id)){
                return customer;
            }
        }
        return null;
    }
}
