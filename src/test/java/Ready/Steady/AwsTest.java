package Ready.Steady;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;




public class AwsTest 
{
	String keyName = "Admin";
	String KeySecrets = "Admin";
	
	Aws obj=new Aws(keyName,KeySecrets);

    @Test
    public void TestingAwsPgm()
    {
    	System.out.println("These Are the Aws Secrets ");
    	String msg=keyName + KeySecrets;
    	System.out.println(msg);
        assertTrue( true );
    }
}
