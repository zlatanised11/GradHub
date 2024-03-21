package Business;
import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;


/**
 *
 * @author sahitinallamolu
 */

public class ConfigureASystem {
    public static EcoSystem configure(){
        EcoSystem system = EcoSystem.getInstance();
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin"); 
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());   
        return system;
    }  
}



