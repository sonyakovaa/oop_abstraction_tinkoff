import java.util.Random;

public class Bulbasaurus extends Pokemon implements IGrassPokemon {


    public Bulbasaurus() {
        super("Bulbasaurus", 250, "травяной тип покемона");
    }

    @Override
    public void knockingDown(Alien alien, Pokemon pokemon) {
        int minDamage = 10, maxDamage = 35;
        Random random = new Random();
        int damageAlien = alien.getHp() - (random.nextInt((maxDamage - minDamage) + 1) + minDamage);

        if (damageAlien <= 0) {
            alien.setHp(0);
        } else {
            alien.setHp(damageAlien);
            pokemon.setHp(pokemon.getHp() + 5);
            System.out.println("Бульбазавр сшибает противника!");
        }
    }

    @Override
    public void photosynthesis(Pokemon pokemon) {
        pokemon.setHp(pokemon.getHp() + 20);
        System.out.println("Бульбазавр применяет защиту в виде фотосинтеза!");
    }

    @Override
    public void run() {
        System.out.println(getName() + " бежит.");
    }
}
