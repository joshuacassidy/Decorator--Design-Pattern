public class Screwdriver implements Tool {

    private String name;

    public Screwdriver() {
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
