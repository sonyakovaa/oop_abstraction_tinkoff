import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class Battle {

    public void battlePikachuReptiloid() {
        Pikachu pikachu = new Pikachu();
        Reptiloid reptiloid = new Reptiloid();
        int countPikachu = 0, countReptiloid = 0;
        Scanner in = new Scanner(System.in);

        while (pikachu.checkHP() && reptiloid.checkHP()) {
            System.out.print("Выбери метод: ");
            int temp, check = 0;
            String choiceOfMethod;

            // ввод для Пикачу и реализация его методов
            do {
                choiceOfMethod = in.nextLine();
                if (choiceOfMethod.equals("3") && countPikachu < 2) {
                    System.out.println("Вы не можете применить восстановление здоровья.");
                    System.out.print("Выберите метод атаки: ");
                } else if (!Objects.equals(choiceOfMethod, "1") &&
                        !Objects.equals(choiceOfMethod, "2") && !Objects.equals(choiceOfMethod, "3")) {
                        System.out.println("Вы не можете применить метод с таким номером.");
                        System.out.print("Выберите метод атаки: ");
                } else check = 1;
            } while (check == 0);

            temp = Integer.parseInt(choiceOfMethod);

            switch (temp) {
                case 1 -> {
                    pikachu.electricShok(reptiloid);
                    countPikachu++;
                }
                case 2 -> {
                    pikachu.electricWave(reptiloid, pikachu);
                    countPikachu++;
                }
                case 3 -> {
                    pikachu.blidness(pikachu);
                    countPikachu = 0;
                }
            }

            System.out.println("HP Пикачу - " + pikachu.getHp() + ", HP рептилоида - " + reptiloid.getHp());
            System.out.println();

            if (pikachu.checkHP() && reptiloid.checkHP()) {
                // реализация методов рептилоида
                Random random = new Random();
                check = 0;
                do {
                    temp = random.nextInt(2);
                    if (temp == 1 && countReptiloid < 2) {
                        check = 0;
                    } else check = 1;

                } while (check == 0);

                switch (temp) {
                    case 0 -> {
                        reptiloid.hitsWithAClaw(pikachu);
                        countReptiloid++;
                    }
                    case 1 -> {
                        reptiloid.becomeInvisible(reptiloid);
                        countReptiloid = 0;
                    }
                }

                System.out.println("HP Пикачу - " + pikachu.getHp() + ", HP рептилоида - " + reptiloid.getHp());
                System.out.println();
            } else {
                return;
            }
        }
    }

    public void battleBulbusaurusAnunnaki() {
        Bulbasaurus bulbasaurus = new Bulbasaurus();
        Anunnaki anunnaki = new Anunnaki();
        int countBulbasaurus = 0, countAnunnaki = 0;
        Scanner in = new Scanner(System.in);

        while (bulbasaurus.checkHP() && anunnaki.checkHP()) {
            System.out.print("Выбери метод: ");
            String choiceOfMethod;
            int temp, check = 0;

            // ввод для бульбазавра и реализация его методов
            do {
                choiceOfMethod = in.nextLine();
                if (choiceOfMethod.equals("2") && countBulbasaurus < 2) {
                    System.out.println("Вы не можете применить восстановление здоровья.");
                    System.out.print("Выберите метод атаки: ");
                } else if (!Objects.equals(choiceOfMethod, "1") &&
                        !Objects.equals(choiceOfMethod, "2")) {
                    System.out.println("Вы не можете применить метод с таким номером.");
                    System.out.print("Выберите метод атаки: ");
                } else check = 1;

            } while (check == 0);

            temp = Integer.parseInt(choiceOfMethod);

            switch (temp) {
                case 1 -> {
                    bulbasaurus.knockingDown(anunnaki, bulbasaurus);
                    countBulbasaurus++;
                }
                case 2 -> {
                    bulbasaurus.photosynthesis(bulbasaurus);
                    countBulbasaurus = 0;
                }
            }

            System.out.println("HP Бульбазавра - " + bulbasaurus.getHp() + ", HP Ануннаки - " + anunnaki.getHp());
            System.out.println();

            if (bulbasaurus.checkHP() && anunnaki.checkHP()) {
                // реализация методов ануннаки
                Random random = new Random();
                check = 0;
                do {
                    temp = random.nextInt(2);
                    if (temp == 1 && countAnunnaki < 2) {
                        check = 0;
                    } else check = 1;

                } while (check == 0);

                switch (temp) {
                    case 0 -> {
                        anunnaki.laserShot(bulbasaurus);
                        countAnunnaki++;
                    }
                    case 1 -> {
                        anunnaki.protectiveField(anunnaki);
                        countAnunnaki = 0;
                    }
                }

                System.out.println("HP Бульбазавра - " + bulbasaurus.getHp() + ", HP Ануннаки - " + anunnaki.getHp());
                System.out.println();
            } else {
                return;
            }
        }
    }

    public void start() {
        System.out.println("""
                Привет, боец! Выбери своего покемона для битвы!
                Нажим 1 и Enter, если ты хочешь быть Пикачу.
                Нажми 2 и Enter, если ты хочешь быть Бульбазавром.
                """);
        Scanner in = new Scanner(System.in);
        String text;
        int check = 0;
        int pokemon = 0;

        do {
            text = in.nextLine();
            if (!Objects.equals(text, "1") && !Objects.equals(text, "2")) {
                System.out.println("Введенное значение должно быть '1' или '2'.");
            } else {
                pokemon = Integer.parseInt(text);
                check = 1;
            }
        } while (check == 0);

        if (pokemon == 1) {
            System.out.println("""
                    Ты - Пикачу, борешься со злым рептилоидом. У каждого из вас есть по 250 HP.
                    Ты можешь выбирать атаки и восстанавливать свое здоровье.
                    Но учти, что здоровье можно восстановить только через два удара.
                    Начнем игру! Перед тобой следующие методы:\s
                    1 - электрический шок (ближняя атака)
                    2 - электрическая волна (дальняя атака, покемон теряет -5 HP)
                    3 - ослепление (защита)""");

            battlePikachuReptiloid();
        } else if (pokemon == 2) {
            System.out.println("""
                    Ты - Бульбазавр, борешься со злым ануннаком. У каждого из вас есть по 250 HP.
                    Ты можешь выбирать атаки и восстанавливать свое здоровье.
                    Но учти, что здоровье можно восстановить только через два удара.
                    Начнем игру! Перед тобой следующие методы:\s
                    1 - сшибание (атака)
                    2 - фотосинтез (защита)""");

            battleBulbusaurusAnunnaki();
        }
    }
}
