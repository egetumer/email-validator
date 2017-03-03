package wilhelm.email_validator;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
        
        String email0 = "user@domain.com";
        String email1 = "userdomain.com";
        String email2 = "user@domain.co.uk";
        String email3 = "user^domain.com";
        String email4 = "user@domaincom";
        String email5 = "user@domain@com";
        String email6 = "user@@domain.com";
        
        email_validator_tester( email0 );
        email_validator_tester( email1 );
        email_validator_tester( email2 );
        email_validator_tester( email3 );
        email_validator_tester( email4 );
        email_validator_tester( email5 );
        email_validator_tester( email6 );
        
    }
    
    public static int email_validator( String email )
    {
    	int result = 0;
    	
    	// if string has a single '@' character increment result by 1 //
    	String email_regex_0 = "^[^@]*@[^@]*$";
    	if ( email.matches(email_regex_0) )
    		result += 1;
    	// if string has at least one '.' character increment result by 1 //
    	String email_regex_1 = "^.*\\..*$";
    	if ( email.matches(email_regex_1) )
    		result += 1;
    	
    	return result;
    }
    
    public static void email_validator_tester( String email )
    {
    	System.out.println( email_validator( email ) + " " + email);
    }
}
