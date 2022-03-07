public abstract class Alien {

    private final String name;
    private int hp;
    private String planet;

    public Alien(String name, int hp, String planet) {
        this.name = name;
        this.hp = hp;
        this.planet = planet;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public void death(String name) {
        System.out.println("Alien named " + name + " died");
    }

    public boolean checkHP() {
        if (getHp() <= 0) {
            death(name);
            return false;
        }
        return true;
    }

    public abstract void run();
}
