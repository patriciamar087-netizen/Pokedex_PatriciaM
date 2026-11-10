package code;

public class PokemonCheck {

    public static void main(String[] args) {

        Pokemon p1 = new Pokemon(25, "pikachu", 4, 60, 112);
        Pokemon p2 = new Pokemon(25, "pikachu", 4, 60, 112);

        System.out.println("Equal? " + p1.equals(p2));
        System.out.println("Hash 1: " + p1.hashCode());
        System.out.println("Hash 2: " + p2.hashCode());

        p2.setBaseExperience(999);

        System.out.println("\nAfter changing base experience:");
        System.out.println("Equal? " + p1.equals(p2));

        System.out.println("\nTesting Getters:");
        System.out.println(p1.getId());
        System.out.println(p1.getName());
        System.out.println(p1.getHeightDm());
        System.out.println(p1.getWeightHg());
        System.out.println(p1.getBaseExperience());

        System.out.println("\nTesting Setters:");
        p1.setName("   CHARIZARD   ");
        System.out.println(p1.getName());

        System.out.println("\nNull test:");
        System.out.println(p1.equals(null));

        System.out.println("\nDifferent type:");
        System.out.println(p1.equals("hello"));
    }
}

//