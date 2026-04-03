public class Crew implements ICrew {
    private String name;

    public Crew(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println("Crew " + this.name + " is doing work.");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void kick() {
        System.out.println("Crew " + this.name + " has been kicked from the spaceship!");
    }

    public void callMeeting() {
        System.out.print(this.name + " found a corpse ");
        System.out.print("and calls a meeting. ");
        System.out.println("Let's find the impostor!");
    }
}