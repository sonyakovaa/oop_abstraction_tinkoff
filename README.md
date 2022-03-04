### Задача: 
Написать эмулятор сражения с выводом в консоль.

### Цель:
Создать минимум две боевые единицы, инсценировать битву с выводом в консоль.

Задача творческая.



### Условия успешного выполнения:

1. Создать абстрактный класс расы своего/своих воинов (минимум 1 абстрактный класс);
2. Абстрактный класс должен содержать 2 поля: имя и класс/специализация. Значения полям задают классы - наследники через конструктор ;
3. Абстрактный класс должен содержать 1 абстрактный метод бег, 1 обычный метод смерть(погиб);
4. Создать минимум 2 интерфейса, которые будут определять специализацию воина (ближний бой, дальний бой/стреляющий, колдующий и тп.) и содержать минимум по одному методу атаки и защиты, характерных для своей специализации.
5. Например, интерфейс "Стреляющий" (для лучника): методы атаки - выстрел из лука, выстрел града стрел из лука, метод защиты - увернулся;
6. Создать минимум 2 класса воинов;
7. Каждый класс должен наследоваться от абстрактного класса и реализовать минимум 1 интерфейс;
8. В классе Battle использовать метод start(), который будет запускать битву, создаст экземпляры своих боевых юнитов и инсценирует битву с выводом в консоль. Осуществление действий юнитами выражается через вывод в консоль. Т.е. в телах соответствующих методов (атака, защита, смерть, движение) необходимо логировать эти действия;
9. В консоль выводится минимум одно событие битвы;
10. Использовать модификаторы доступа;

--- 
### Дополнение.

* Ход боя представляет собой, по сути, последовательность вызовов различных методов из ваших юнитов.
* Бой может проходить между ними или против какой-то третей стороны.
* К боевым единицам могут относится маги, войны(рыцари), лучники, ассасины и тп.
* Можно использовать ввод с консоли
--- 
##### Примеры конечных юнитов в формате <_абстрактный класс_>-<_класс наследник_>-<_интерфейс_>:

* орк-воин-стреляющий,
* человек-маг-колдующий
* ящер-бард-летающий и т.д.

--- 
#### Программа выглядит следующим образом:
В классе Main вызывается метод start() класса Battle, в консоль выводит тест сражения.


--- 
#### Пример вывода сражения в консоль:


> лучник Варус выпускает ядовитую стрелу <br />
ассасин Талон увернулся <br />
Варус выпускает град стрел <br />
Талон стал невидимым и сбегает <br />
лучник Варус час ждет ассасина и не дождавшись уходит домой <br />
Happy end!