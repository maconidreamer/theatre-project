import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Петров", Gender.MALE, 180);
        Actor actor2 = new Actor("Анна", "Смирнова", Gender.FEMALE, 170);
        Actor actor3 = new Actor("Олег", "Иванов", Gender.MALE, 175);

        Director director1 = new Director("Мария", "Соколова", Gender.FEMALE, 12);
        Director director2 = new Director("Алексей", "Кузнецов", Gender.MALE, 8);

        ArrayList<Actor> dramaActors = new ArrayList<>();
        dramaActors.add(actor1);
        dramaActors.add(actor2);

        ArrayList<Actor> operaActors = new ArrayList<>();
        operaActors.add(actor1);
        operaActors.add(actor3);

        ArrayList<Actor> balletActors = new ArrayList<>();
        balletActors.add(actor2);
        balletActors.add(actor3);

        Show drama = new Show(
                "Вишнёвый сад",
                150,
                director1,
                dramaActors
        );

        Opera opera = new Opera(
                "Травиата",
                180,
                director2,
                operaActors,
                "Джузеппе Верди",
                "История любви Виолетты и Альфреда.",
                40
        );

        Ballet ballet = new Ballet(
                "Лебединое озеро",
                160,
                director1,
                balletActors,
                "Пётр Чайковский",
                "История принца Зигфрида и заколдованной Одетты.",
                "Мариус Петипа"
        );

        drama.printDirectorInfo();
        drama.printActorsList();

        System.out.println();

        opera.printDirectorInfo();
        opera.printActorsList();

        System.out.println();

        ballet.printDirectorInfo();
        ballet.printActorsList();

        System.out.println();

        Actor newActor = new Actor("Елена", "Орлова", Gender.FEMALE, 168);

        drama.addActor(newActor);
        drama.printActorsList();

        System.out.println();

        drama.replaceActor(actor3, "Орлова");
        drama.printActorsList();

        System.out.println();

        opera.replaceActor(newActor, "Несуществующий");

        System.out.println();

        opera.printLibretto();

        System.out.println();

        ballet.printLibretto();
    }
}
