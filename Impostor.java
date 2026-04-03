public class Impostor implements IImpostor, ICrew {
    private final String name;

    public Impostor(String name) {
        this.name = name;
    }

    @Override
    public void kill(ICrew crew) {
        System.out.println(crew.getName() + " has been killed!");
    }

    @Override
    public void doWork() {
        System.out.println("Impostor " + this.name + " is doing work.");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void kick() {
        System.out.println("Impostor " + this.name + " has been kicked from the spaceship!");
    }
}