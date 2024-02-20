import java.util.Scanner;

enum PoliticalZone {
    NORTH_CENTRAL,
    NORTH_EAST,
    NORTH_WEST,
    SOUTH_EAST,
    SOUTH_SOUTH,
    SOUTH_WEST
}

class State {
    String name;
    PoliticalZone zone;

    public State(String name, PoliticalZone zone) {
        this.name = name;
        this.zone = zone;
    }
}

public class PoliticalZoneApp {
    public static void main(String[] args) {
        State[] states = {
                new State("Abia", PoliticalZone.SOUTH_EAST),
                new State("Adamawa", PoliticalZone.NORTH_EAST),
                new State("Akwa Ibom", PoliticalZone.SOUTH_SOUTH),
                new State("Anambra", PoliticalZone.SOUTH_EAST),
                new State("Bauchi", PoliticalZone.NORTH_EAST),
                new State("Bayelsa", PoliticalZone.SOUTH_SOUTH),
                new State("Benue", PoliticalZone.NORTH_CENTRAL),
                new State("Borno", PoliticalZone.NORTH_EAST),
                new State("Cross River", PoliticalZone.SOUTH_SOUTH),
                new State("Delta", PoliticalZone.SOUTH_SOUTH),
                new State("Ebonyi", PoliticalZone.SOUTH_EAST),
                new State("Edo", PoliticalZone.SOUTH_SOUTH),
                new State("Ekiti", PoliticalZone.SOUTH_WEST),
                new State("Enugu", PoliticalZone.SOUTH_EAST),
                new State("Gombe", PoliticalZone.NORTH_EAST),
                new State("Imo", PoliticalZone.SOUTH_EAST),
                new State("Jigawa", PoliticalZone.NORTH_WEST),
                new State("Kaduna", PoliticalZone.NORTH_WEST),
                new State("Kano", PoliticalZone.NORTH_WEST),
                new State("Katsina", PoliticalZone.NORTH_WEST),
                new State("Kebbi", PoliticalZone.NORTH_WEST),
                new State("Kogi", PoliticalZone.NORTH_CENTRAL),
                new State("Kwara", PoliticalZone.NORTH_CENTRAL),
                new State("Lagos", PoliticalZone.SOUTH_WEST),
                new State("Nasarawa", PoliticalZone.NORTH_CENTRAL),
                new State("Niger", PoliticalZone.NORTH_CENTRAL),
                new State("Ogun", PoliticalZone.SOUTH_WEST),
                new State("Ondo", PoliticalZone.SOUTH_WEST),
                new State("Osun", PoliticalZone.SOUTH_WEST),
                new State("Oyo", PoliticalZone.SOUTH_WEST),
                new State("Plateau", PoliticalZone.NORTH_CENTRAL),
                new State("Rivers", PoliticalZone.SOUTH_SOUTH),
                new State("Sokoto", PoliticalZone.NORTH_WEST),
                new State("Taraba", PoliticalZone.NORTH_EAST),
                new State("Yobe", PoliticalZone.NORTH_EAST),
                new State("Zamfara", PoliticalZone.NORTH_WEST)
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of your state: ");
        String inputState = scanner.nextLine();

        boolean isFound = false;
        for (State state : states) {
            if (state.name.equalsIgnoreCase(inputState)) {
                System.out.println("Your state, " + state.name + ", belongs to the " + state.zone + " political zone.");
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("State not isFound. Please check your input.");
        }

        scanner.close();
    }
}