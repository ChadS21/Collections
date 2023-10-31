
/**
 * Write a description of class Castaway here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Castaway
{
    private String[] lastName = {"", "Grumby", "Howell", "Howell", "Grant", "Hinkley",
                                    "Summers"};
    private String[] firstName = {"Gilligan", "Jonas", "Thurston", "Lovey", "Ginger",
                                    "Roy", "Mary Ann"};
    private int[] score = {72, 85, 82, 96, 90, 96, 88};
    private String[] gender = {"M", "M", "M", "F", "F", "M", "F"};
    private String lName;
    private String fName;
    private int theScore;
    private String theGender;

    public Castaway(int index) {
        lName = lastName[index];
        fName = firstName[index];
        theScore = score[index];
        theGender = gender[index];
    }
    
    public int compareTo(Castaway other) {
        if (lName.compareTo(other.lName) == 0) {
            if (fName.compareTo(other.fName) <= 0) {
                return -1;
            }
            return 1;
        } else if (lName.compareTo(other.lName) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
    
    public boolean equals(Castaway other) {
        return true;
    }
    
    public String toString() {
        String str = "";
        return str;
    }
    
    public void test() {
        
    }
}
