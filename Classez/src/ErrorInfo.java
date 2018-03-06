//Class 02 of prog with Err and ErrInfo
// Method returning an object

public class ErrorInfo 
{
	String msgs[]={"Output Error","Input Error","Disk Full","Index Out Of bounds"};
	int howbad[]={3,3,2,4};
	Err getErrorInfo(int i)
	{
		if(i>=0 && i<msgs.length)
			return new Err(msgs[i],howbad[i]);
		else
			return new Err("Invalid code",0);
	}
}
