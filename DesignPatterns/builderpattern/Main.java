package DesignPatterns.builderpattern;

public class Main
{
    public static void main(String args[])
    {
        User user1 =User.builder("gopal","gpl.msh@gmail.com").build();
        System.out.println(user1);
        User user2 = User.builder("Marry","marrygoez@gmail.com")
                .city("Colombo")
                .build();
        System.out.println(user2);

    }
}
