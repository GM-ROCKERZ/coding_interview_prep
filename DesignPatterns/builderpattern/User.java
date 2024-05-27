package DesignPatterns.builderpattern;

public class User
{
    private String name;
    private String email;
    private String phone;
    private String city;

    public User(UserBuilder userBuilder)
    {
        this.name = userBuilder.getName();
        this.email = userBuilder.getEmail();
        this.phone = userBuilder.getPhone();
        this.city =userBuilder.getCity();

    }
    public static UserBuilder builder(String name,String email)
    {
        return new UserBuilder(name ,email);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
