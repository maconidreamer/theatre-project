import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
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
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);

            if (actor.getSurname().equals(oldActorSurname)) {
                listOfActors.set(i, newActor);
                return;
            }
        }

        System.out.println("Актёра с фамилией " + oldActorSurname + " нет в спектакле.");
    }

    @Override
    public String toString() {
        return title + ", длительность: " + duration + " минут";
    }
}
