package skeleton;

public class Person {
private int distance;
private String message;
	


public void setDistance(Integer int1) {
	distance=int1;
	
}

public void setMessage(String string) {
	// TODO Auto-generated method stub
	if(distance>0 && distance<30)
	{
	message=string;
	}
	else
	{
		message=null;
	}
}

public String getMessage() {
	
	return message;
}


}
