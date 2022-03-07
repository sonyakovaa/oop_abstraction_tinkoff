public interface IElectricPokemon {

    void electricShok(Alien aliens); // атака - ближний бой

    void electricWave(Alien alien, Pokemon electricPokemon); // атака - дальний бой,
        // при использовании отнимает у покемана -10 HP

    void blidness(Pokemon electricPokemon); // защита
}
