package Ready.Steady;

public class Aws 
{
	private String keyName ;
		private String keySecrets ;
		String user = System.getProperty("PaSsWoRd");
		public Aws(String keyName,String keySecrets) {
			this.keyName=keyName;
			this.keySecrets=keySecrets;
			
		}
    public static void main( String[] args )
    {
      
    }
}
