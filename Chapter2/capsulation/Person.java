package Chapter2.capsulation;

public class Person {

    private String name;
    private String secret;

    public Person(String name, String secret) {
        this.name = name;
        this.secret = secret;
    }

    public void methodA() {
    }

    private void methodB() {
    }

    //게터
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
