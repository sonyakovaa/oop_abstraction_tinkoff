public abstract class Pokemon {

    private final String name;
    private int hp;
    private String specialization;

    public Pokemon(String name, int hp, String specialization) {
        this.name = name;
        this.hp = hp;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void death(String name) {
        System.out.println("Pokemon named " + name + " died");
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
