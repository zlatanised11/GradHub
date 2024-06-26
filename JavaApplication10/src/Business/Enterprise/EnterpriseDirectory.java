/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;



/**
 *
 * @author sahitinallamolu
 */

public class EnterpriseDirectory 
{
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() 
    {
        return enterpriseList;
    }

    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) 
    {
        this.enterpriseList = enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        
        if(type==Enterprise.EnterpriseType.Hospital)
        {
            enterprise=new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Education){
            enterprise=new EducationEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(type==Enterprise.EnterpriseType.Housing){
            enterprise=new HousingEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(type==Enterprise.EnterpriseType.Job){
            enterprise=new JobEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
}
