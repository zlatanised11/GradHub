/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import java.util.ArrayList;
import Business.Role.Role;

import Business.Role.TempHousingRole;


/**
 *
 * @author Gamer
 */


public class TempHousingOrganization extends Organization{

    public TempHousingOrganization() 
    {
        
        
        super(Organization.Type.TempHousing.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() 
    {
        ArrayList<Role> roles = new ArrayList();
        
        
        roles.add(new TempHousingRole());
        
        return roles;
    }
     
}
