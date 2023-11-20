
public class MainBook {

public static void main(String[] args)
{
Book bk = new Book("Tolstoy", "A.Karenina", 346,1234);
//String s = bk.toString();
//System.out.println(s);
System.out.println(bk);

FictionBook fb = new FictionBook("Gogol","Nos",
		                         23, 5432, "fantacy");
System.out.println(fb);
EducationBook edb = new EducationBook("Ivanov","Geometry",
		                           230,7777, "Math");
System.out.println(edb);
	

}

}
/*
               Object 
                toString()
      		     |
      			Book
      			----
      			author
      			title
      			pages
      			isbn
      			toString()
        |                 |
      FictionBook    EducationBook
      -----------    -------------
       genre             subject
       toString()      toString()
             
      
      
      
      
      
     



*/