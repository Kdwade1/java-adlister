package Beans;

import Beans.Album;
import Beans.Author;

import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {

        Album s1 =new Album();
        Album s2 =new Album();
        Album s3 = new Album();

        //Authors

        Author a1 = new Author(1,"Darren","Shan",1);
        Author a2= new Author(2,"Charles","Dickerson",2);
        Author a3= new Author(3,"j.k","rowling",3);

        //Quotes

        Quotes q1= new Quotes(1,"Hello and goodbye",a1);
        Quotes q2= new Quotes(2,"I am the Vapanese lord",a3);
        Quotes q3 = new Quotes(3,"“It is a far, far better thing that I do, than I have ever done; it is a far, far better rest I go to than I have ever known.”",a2);


ArrayList<Quotes>Qlist = new ArrayList<>();
Qlist.add(q1);
Qlist.add(q2);
Qlist.add(q3);

        for (Quotes quotes : Qlist) {
            System.out.println(quotes.getContent() + " "+ quotes.getAuthor().getFirstname() +" "+ quotes.getAuthor().getLastname());
        }

    }
}
