
/**
 * Write a description of class Castaway here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Castaway implements Comparable<Castaway>
{
    private String lName;
    private String fName;
    private int theScore;
    private String theGender;

    public Castaway(String last, String first, int score, String gender) {
        lName = last;
        fName = first;
        theScore = score;
        theGender = gender;
    }
    
    public int compareTo(Castaway other) {
        if (lName.compareTo(other.lName) == 0) {
            return fName.compareTo(other.fName);
        } else {
            return lName.compareTo(other.lName);
        }
    }
    
    @Override
    public boolean equals(Object other) {
        return compareTo((Castaway) other) == 0;
    }
    
    public String toString() {
        return lName + ", " + fName + ", " + theScore + ", " + theGender;
    }
    
    
    public static void test() {
        String[] lastName = {"", "Grumby", "Howell", "Howell", "Grant", "Hinkley",
                                    "Summers"};
        String[] firstName = {"Gilligan", "Jonas", "Thurston", "Lovey", "Ginger",
                                        "Roy", "Mary Ann"};
        int[] score = {72, 85, 82, 96, 90, 96, 88};
        String[] gender = {"M", "M", "M", "F", "F", "M", "F"};
        MyLinkedList<Castaway> list = new MyLinkedList<Castaway>();
        
        for (int i = 0; i < 7; i++)
        {
            list.insertSorted(new Castaway(lastName[i], firstName[i], score[i], gender[i]));
        }
        System.out.println(list);
        System.out.println(list.remove(new Castaway("", "Gilligan", 0, "")));
        System.out.println(list);
    }
}
