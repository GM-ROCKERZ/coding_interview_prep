package basiccodinginterviewquestions.immutableClass;

public class Main
{
    public static void main(String args[])
    {
        ImmutableClassExample person = new ImmutableClassExample("Gopal",31);
        System.out.println(person.getName());
        System.out.println(person.getAge());

    }
}
