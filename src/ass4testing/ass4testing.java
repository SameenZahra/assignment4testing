/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass4testing;

/**
 *
 * @author Sameen Naqvi
 */
public class ass4testing {
      
      static public double percent(int ass,int mid,int finals) {//numbers input from 100
             double avg=0;
            if ((ass > 5 && mid == 10) && finals >= 20) 
            {   
               avg = (ass+mid+finals)/3;
         
            } 
            if ((avg > 5 || mid == 10) || finals >= 20 ) 
            {   
                avg=avg+2;
         
            } 
             return avg;
        
      };   
}
​

           
    
    


