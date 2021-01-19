import Animals.homework.Animals;
import Animals.homework.Cat;
import Animals.homework.Dog;

/**
 * 1. Создать классы Собака и Кот с наследованием от класса Животное.
 * 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
 * Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
 * 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
 */

public class Main {
    public static void main(String[] args) {
        Animals[] animals = {
                new Cat(),
                new Dog()
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(150);
            animals[i].swim(150);
        }

    }
}
