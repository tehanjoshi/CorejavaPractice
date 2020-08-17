
public class S extends P 
{
	S(){            
		super(20);
        System.out.println(" S1 class");

}



S(int num){             
super(10);
        System.out.println(" S1 class num");

}

void display(){

        System.out.println("Hello!");

}


public static void main(String args[]){                            

    S obj= new S();           

    obj.display();                  

    S obj2= new S(10);

obj2.display();

}

} 



