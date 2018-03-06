//2 RUN THIS
public class FileHelp 
{

	public static void main(String[] args) 
	{
		Help hlpobj = new Help("helpfile");
	    String topic;

	    System.out.println("Try the help system. " +"Enter 'stop' to end.");
	                       
	    	do 
	    	{
	    		topic = hlpobj.getSelection();

	    		if(!hlpobj.helpOn(topic))
	    			System.out.println("Topic not found.\n");
	    		if(topic=="stop")
	    			System.out.println(" ENDING");

	    	} while(topic.compareTo("stop") != 0);

	}

}
