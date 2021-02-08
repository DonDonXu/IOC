package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        UserServiceImpl uservice = new UserServiceImpl();
        uservice.setUserdao(new UserDaoImpl());
        uservice.getUser();
    }
}
