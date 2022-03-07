import java.lang.annotation.ElementType;
import java.util.Random;

public class Reptiloid extends Alien implements IReptiloid {


    public Reptiloid() {
        super("Reptiloid", 250, "Mars");
    }


    @Override
    public void hitsWithAClaw(Pokemon pokemon) {
        int minDamage = 20, maxDamage = 60;
        Random random = new Random();
        int damagePokemon = pokemon.getHp() - (random.nextInt((maxDamage - minDamage) + 1) + minDamage);

        if (damagePokemon <= 0) {
            pokemon.setHp(0);
        } else {
            pokemon.setHp(damagePokemon);
            System.out.println("Рептилоид бьет когтями противника!");
        }
    }

    @Override
    public void becomeInvisible(Alien alien) {
        alien.setHp(alien.getHp() + 10);
        System.out.println("Рептилоид становится невидимкой и уворачивается от удара!");
    }

    @Override
    public void run() {
        System.out.println(getName() + " бежит.");
    }
}
