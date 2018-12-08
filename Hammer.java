public class Hammer implements Tool {

    private String name;

    public Hammer() {
        this.name = "Hammer";
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
