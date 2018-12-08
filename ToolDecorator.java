public abstract class ToolDecorator implements Tool {

    protected Tool toolDecorator;

    public ToolDecorator(Tool toolDecorator) {
        this.toolDecorator = toolDecorator;
    }

    @Override
    public void create() {
        toolDecorator.create();
    }

    @Override
    public String getName() {
        return getName();
    }
}
