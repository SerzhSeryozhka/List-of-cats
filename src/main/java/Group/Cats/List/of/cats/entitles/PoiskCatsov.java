package Group.Cats.List.of.cats.entitles;

public class PoiskCatsov {
    private int id, age;
    private String color, name;

    public PoiskCatsov(int id, int age, String color, String name) throws Exception {
        if (age<0)
            throw new Exception("Такой ещё не родился");
        if (age>25)
            throw new Exception("котик машет с небес");
        this.id = id;
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
