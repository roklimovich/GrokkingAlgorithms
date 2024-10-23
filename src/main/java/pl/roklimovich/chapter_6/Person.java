package pl.roklimovich.chapter_6;

public class Person {
    private String name;
    private boolean isSeller;

    public Person(String name, boolean isSeller) {
        this.name = name;
        this.isSeller = isSeller;
    }


    public String getName() {
        return name;
    }

    public boolean isSeller() {
        return isSeller;
    }

    @Override
    public String toString() {
        return "Name: " + name + " isSeller: " + isSeller;
    }
}
