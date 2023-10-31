
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
            return fName.compareTo(other.fName);
        } else {
            return lName.compareTo(other.lName);
        }
    }
    
    public boolean equals(Castaway other) {
        if (fName.equals(other.fName) && lName.equals(other.lName) &&
                theScore == other.theScore && theGender.equals(other.theGender)) {
            return true;
        }
        return false;
    }
    
    public String toString() {
        return lName + ", " + fName + ", " + theScore + ", " + theGender;
    }
    
    
    public void test() {
        Castaway castaway1 = new Castaway(1);
        Castaway castaway2 = new Castaway(2);
        Castaway castaway3 = new Castaway(3);
        Castaway castaway4 = new Castaway(4);
        Castaway castaway5 = new Castaway(5);
        Castaway castaway6 = new Castaway(6);
        Castaway castaway7 = new Castaway(7);
    }
}
