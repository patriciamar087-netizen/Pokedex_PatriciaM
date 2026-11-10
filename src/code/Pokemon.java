package code;

import java.util.Locale;
import java.util.Objects;

// Raw height is in decimeters; weight is in hectograms.
public class Pokemon {

    private int id;
    private String name;
    private int heightDm;
    private int weightHg;
    private int baseExperience;

    public Pokemon(int id, String name, int heightDm,
                   int weightHg, int baseExperience) {

        setId(id);
        setName(name);
        setHeightDm(heightDm);
        setWeightHg(weightHg);
        setBaseExperience(baseExperience);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHeightDm() {
        return heightDm;
    }

    public int getWeightHg() {
        return weightHg;
    }

    public int getBaseExperience() {
        return baseExperience;
    }

    // Setters
    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        }
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim().toLowerCase();
        }
    }

    public void setHeightDm(int heightDm) {
        if (heightDm >= 0) {
            this.heightDm = heightDm;
        }
    }

    public void setWeightHg(int weightHg) {
        if (weightHg >= 0) {
            this.weightHg = weightHg;
        }
    }

    public void setBaseExperience(int baseExperience) {
        if (baseExperience >= 0) {
            this.baseExperience = baseExperience;
        }
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Pokemon other = (Pokemon) obj;

        return id == other.id
                && heightDm == other.heightDm
                && weightHg == other.weightHg
                && baseExperience == other.baseExperience
                && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, heightDm,
                            weightHg, baseExperience);
    }

    @Override
    public String toString() {
        return String.format(Locale.US,
                "#%d %s | Height: %.1f m | Weight: %.1f kg | Base experience: %d",
                id, name, heightDm / 10.0,
                weightHg / 10.0, baseExperience);
    }
}