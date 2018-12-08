public class RedToolDecorator extends ToolDecorator {

    private Tool toolDecorator;

    public RedToolDecorator(Tool toolDecorator) {
        super(toolDecorator);
        this.toolDecorator = toolDecorator;
    }

    @Override
    public void create() {
        this.toolDecorator.create();
        this.paint();
    }

    private void paint() {
        System.out.println("Painted the " + this.toolDecorator.getName() + " red!");
    }

}
