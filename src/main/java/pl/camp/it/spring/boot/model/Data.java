package pl.camp.it.spring.boot.model;

public class Data {
    private String login;
    private String name;
    private String surname;
    private int age;
    private String city;
    private String street;
    private String pass;

    public Data() {
    }

    public Data(String login, String name, String surname, int age, String city, String street, String pass) {
        this.login = login;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
        this.street = street;
        this.pass = pass;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
