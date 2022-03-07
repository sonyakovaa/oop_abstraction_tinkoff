import java.util.Random;

public class Anunnaki extends Alien implements IAnunnaki {


    public Anunnaki() {
        super("Anunnaki", 250, "Pluto");
    }

    @Override
    public void laserShot(Pokemon pokemon) {
        int minDamage = 15, maxDamage = 45;
        Random random = new Random();
        int damagePokemon = pokemon.getHp() - (random.nextInt((maxDamage - minDamage) + 1) + minDamage);

        if (damagePokemon <= 0) {
            pokemon.setHp(0);
        } else {
            pokemon.setHp(damagePokemon);
            System.out.println("Аннунаки применяет лазерный удар!");
        }
    }

    @Override
    public void protectiveField(Alien alien) {
        alien.setHp(alien.getHp() + 10);
        System.out.println("Аннунаки уварачивается от удара, применяя защитное поле!");
    }

    @Override
    public void run() {
        System.out.println(getName() + " бежит.");
    }
}
