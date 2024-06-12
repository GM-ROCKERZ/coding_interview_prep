package interviewPractice.src.basiccodinginterviewquestions.immutableClass;

public class ImmutableClassExample
{
    private final String name;
    private final int age;

    public ImmutableClassExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ImmutableClassExample{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
