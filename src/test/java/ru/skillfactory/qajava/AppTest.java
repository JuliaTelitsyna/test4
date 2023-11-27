package ru.skillfactory.qajava;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 

{
    @BeforeClass
    void beforeClass (){
        System.out.println("Перед классом");
}
   @DataProvider (name ="Dannye")
   Object [][] dataProvider()
    {return new Object[][]
        {{2,4},
            {1,1},
            {-1,1},
            {0,0}

        };

    }

    @Test (dataProvider = "Dannye")
    void proverka (int arg1,int result)
    {
        int res=App.kvadro(arg1);
        assertEquals(res,result);
        System.out.println("для "+arg1+ "проверено");
    }


}
