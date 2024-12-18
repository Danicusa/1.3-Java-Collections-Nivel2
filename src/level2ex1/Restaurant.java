package level2ex1;

import java.util.Objects;

public class Restaurant {
    private String name;
    private int score;

    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }
    @Override
    public boolean equals(Object obj) {
    	
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;
        
        Restaurant other = (Restaurant) obj;

        return Objects.equals(name, other.name) && score == other.score;
    }
    
    @Override
    public int hashCode() {
    	
        return Objects.hash(name, score);
    }
    
    public String toString() {
    	return "Restaurant: " + this.getName() + " - Score: " + this.getScore();
    }
}
