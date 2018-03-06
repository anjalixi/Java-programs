// Class 03 of prog with Err and ErrorInfo
// Method returning an object
public class ErrInfo 
{

	public static void main(String[] args) 
	{
		ErrorInfo x=new ErrorInfo();
		Err e;
		e=x.getErrorInfo(2);
		System.out.println(e.msg+"  "+e.severity);
		e=x.getErrorInfo(9);
		System.out.println(e.msg+"  "+e.severity);
		

	}

}
