/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import java.util.ArrayList;
import Business.Role.Role;
import Business.Role.DoctorRole;



/**
 *
 * @author Gamer
 */
public class DoctorOrganization extends Organization{

    public DoctorOrganization() {
        
        super(Organization.Type.Doctor.getValue());
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        
        roles.add(new DoctorRole());
         
        return roles;
        
    }
     
}