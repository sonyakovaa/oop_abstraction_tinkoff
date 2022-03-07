import java.util.Random;

public class Jolteon extends Pokemon implements IElectricPokemon{
    public Jolteon(String name, int hp, String specialization) {
        super("Jolteon", 250, "electric type");
    }

    @Override
    public void electricShok(Alien alien) {
        int minDamage = 5, maxDamage = 45;
        Random random = new Random();
        int damageAlien = alien.getHp() - (random.nextInt((maxDamage - minDamage) + 1) + minDamage);

        if (damageAlien <= 0) {
            alien.setHp(0);
        } else {
            alien.setHp(damageAlien);
            System.out.println("Джолтеон применяет электрошок и парализует противника!");
        }
    }

    @Override
    public void electricWave(Alien alien, Pokemon electricPokemon) {
        int minDamage = 20, maxDamage = 60;
        Random random = new Random();
        int damageAlien = alien.getHp() - (random.nextInt((maxDamage - minDamage) + 1) + minDamage);

        if (damageAlien <= 0) {
            alien.setHp(0);
        } else {
            alien.setHp(damageAlien);
            electricPokemon.setHp(electricPokemon.getHp() - 5);
            System.out.println("Джолтеон применяет электроволну, но, к сожалению, теряет -5 HP...");
        }
    }

    @Override
    public void blidness(Pokemon electricPokemon) {
        electricPokemon.setHp(electricPokemon.getHp() + 35);
        System.out.println("Джолтеон ослепляет противника и восстанавливает свое здоровье!");
    }

    @Override
    public void run() {
        System.out.println(getName() + " бежит.");
    }
}
