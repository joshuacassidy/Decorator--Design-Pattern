public class Saw implements Tool {

    private String name;

    public Saw() {
        this.name = "Saw";
    }

    @Override
    public void create() {
        System.out.println("Created a " + name + "!");
    }

    @Override
    public String getName() {
        return name;
    }
}
