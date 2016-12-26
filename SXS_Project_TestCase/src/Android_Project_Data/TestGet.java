package Android_Project_Data;

import Android_Project_ExPage.Android_GetCodeFromDatabase;
import org.junit.Test;

/**
 * Created by Dreamslians on 2016/11/24.
 */
public class TestGet
{
    Android_GetCodeFromDatabase ag = new Android_GetCodeFromDatabase();
    @Test
    public void doTest(){
//        ag.Dq_earnings();
//        ag.Dq_Inmoney();
//        System.out.println(ag.Dq_earnings()+ag.Dq_Inmoney());

//        double a = Double.valueOf(ag.Dq_earnings());
//        double b = Double.valueOf(ag.Dq_Inmoney());
//        System.out.println(a+b);
        ag.GetInuseByLoginPage();
    }
}
