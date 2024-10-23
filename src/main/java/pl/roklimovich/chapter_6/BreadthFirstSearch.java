package pl.roklimovich.chapter_6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;

public class BreadthFirstSearch {
    public static Person you = new Person("Roma", false);
    public static Person clare = new Person("Clare", true);
    public static Person alice = new Person("Alice", false);
    public static Person bob = new Person("Bob", false);
    public static Person anuj = new Person("Anuj", false);
    public static Person leggi = new Person("Leggi", false);
    public static Person jhonny = new Person("Jhonny", false);
    public static Person tom = new Person("Tom", true);

    public static void main(String[] args) {

        Hashtable<Person, Person[]> graph = new Hashtable<>();
        Person[] myNeighbours = {clare, alice, bob};
        Person[] bobNeighbours = {anuj, leggi};
        Person[] aliceNeighbours = {leggi};
        Person[] clareNeighbours = {jhonny, tom};


        graph.put(you, myNeighbours);
        graph.put(bob, bobNeighbours);
        graph.put(alice, aliceNeighbours);
        graph.put(leggi, new Person[]{});
        graph.put(anuj, new Person[]{});
        graph.put(clare, clareNeighbours);
        graph.put(tom, new Person[]{});
        graph.put(jhonny, new Person[]{});

        Person result = search(graph);
        System.out.println(result);


        City bialystok = new City("Bialystok");
        City warsaw = new City("Warsaw");
        City lapy = new City("Lapy");
        City lodz = new City("Lodz");
        City poznan = new City("Poznan");
        City[] bialystokNeighbours = {warsaw, lapy};
        City[] warsawNeighbours = {bialystok, poznan};
        City[] lapyNeighbours = {bialystok, lodz};
        City[] poznanNeighbours = {warsaw, lodz};
        City[] lodzNeighbours = {poznan, lapy};

        HashMap<City, City[]> graphCity = new HashMap<>();
        graphCity.put(bialystok, bialystokNeighbours);
        graphCity.put(warsaw, warsawNeighbours);
        graphCity.put(lapy, lapyNeighbours);
        graphCity.put(poznan, poznanNeighbours);
        graphCity.put(lodz, lodzNeighbours);

        System.out.println(searchCity(warsaw, lodz, graphCity));


    }

    public static Person search(Hashtable<Person, Person[]> graph) {
        LinkedList<Person> searchQueue = new LinkedList<>();
        searchQueue.add(you);

        Hashtable<Person, Boolean> checked = new Hashtable<>();
        checked.put(you, true);

        while (!searchQueue.isEmpty()) {

            Person person = searchQueue.poll();

            if (person.isSeller()) {
                return person;
            } else {
                Person[] personNeighbours = graph.get(person);

                for (Person neighbour : personNeighbours) {
                    if (!checked.containsKey(neighbour)) {
                        searchQueue.add(neighbour);
                        checked.put(neighbour, true);
                    }
                }
            }
        }

        return null;
    }

    // write method which will be found the shortest route from one city to another
    public static String searchCity(City from, City destination, HashMap<City, City[]> graphCity) {
        // store info about route
        StringBuilder route = new StringBuilder();

        LinkedList<City> searchQueue = new LinkedList<>();
        searchQueue.add(from);

        HashMap<City, Boolean> checked = new HashMap<>();
        checked.put(from, true);

        HashMap<City, City> path = new HashMap<>();
        path.put(from, null);

        while (!searchQueue.isEmpty()) {
            City city = searchQueue.poll();

            if (city.equals(destination)) {

                City current = destination;

                while (current != null) {
                    route.insert(0, current.getCityName() + " -> ");
                    current = path.get(current);
                }

                return route.substring(0, route.length() - 4);

            } else {

                City[] cityNeighbours = graphCity.get(city);

                for (City neighbour : cityNeighbours) {
                    if (!checked.containsKey(neighbour)) {
                        searchQueue.add(neighbour);
                        checked.put(neighbour, true);
                        path.put(neighbour, city);
                    }
                }
             }
        }

        return null;
    }
}
