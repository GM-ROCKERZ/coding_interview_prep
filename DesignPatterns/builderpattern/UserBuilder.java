package DesignPatterns.builderpattern;

public class UserBuilder
{
    private String name; // required field
    private String email; //  required field
    private String phone = "unknown"; // optional field
    private String city = "unknown"; // optional field

    public UserBuilder(String name,String email)
    {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }
    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public UserBuilder city(String city) {
        this.city = city;
        return this;
    }

    public User build() {
        return new User(this);
    }
}
