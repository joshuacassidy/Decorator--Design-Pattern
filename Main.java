public class Main {

    public static void main(String[] args) {

        Tool saw = new Saw();
        saw.create();

        Tool redSaw = new RedToolDecorator(new Saw());
        redSaw.create();

    }

}
