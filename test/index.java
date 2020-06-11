import ass4testing.ass4testing;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import junit.framework.Assert;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static ass4testing.ass4testing.percent;
import static junit.framework.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sameen Zahra
 */
@RunWith(Parameterized.class)
public class index{
     double expres;
    int ass;
    int mid;
    int finals;
     ass4testing m;
  
   
    

    public index(int ass,int mid,int finals,int viva,int project) {
        this.ass=ass;
        this.mid=mid;
        this.finals=finals;
       
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

   

    /**
     * Test of average method, of class ass4testing 
     * @return 
     */
    @Parameterized.Parameters
     public static Collection tax(){
     return Arrays.asList(new Object[][]{
     
        {14.0,6,10,20},
         {11.6,6,10,19},
         {13.0,6,9,20},
         {13.3,6,9,19},
         {13.3,4,10,20},
          {11.0,4,10,19},
          {13.0,4,9,20},
           {10.6,4,9,19}
         
      });
    }
    @Test
    public void testAverage() {
         m=new ass4testing();
        System.out.println("getTax");
        assertEquals(expres,ass4testing.percent(ass, mid,finals));
        // TODO review the generated test code and remove the default call to fail.
        
    }

}