import java.util.ArrayList;

public class Show {
    protected final String title;
    protected final int duration;
    protected final Director director;
    protected final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printDirectorInfo() {
        System.out.println("Режиссёр спектакля: " + director);
    }

    public void printActorsList() {
        System.out.println("Актёры спектакля \"" + title + "\":");

        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актёр уже есть в спектакле.");
            return;
        }

        listOfActors.add(actor);
    }

    public void replaceActor(Actor newActor, String oldActorSurname) {
        int count = 0;
        int index = -1;

        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);

            if (actor.surname.equals(oldActorSurname)) {
                count++;
                index = i;
            }
        }

        if (count == 0) {
            System.out.println("Актёра с фамилией " + oldActorSurname + " нет в спектакле.");
            return;
        }

        if (count > 1) {
            System.out.println("Найдено несколько актёров с фамилией " + oldActorSurname + ". Замена невозможна.");
            return;
        }

        listOfActors.set(index, newActor);
    }

    @Override
    public String toString() {
        return title + ", длительность: " + duration + " минут";
    }
}
