package DataStructures;
import java.util.HashMap;
import java.util.Set;
public class Abbreviation {
    private HashMap<String, String> abbreviation;
    public Abbreviation() {
        abbreviation = new HashMap<>();
    }
    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviation = sanitizeString(abbreviation);
        if(this.hasAbbreviation(abbreviation)) {
            System.out.println("The given key: "+abbreviation+" is already added to the abbreviation dicitonary.");
        }
        else {
            this.abbreviation.put(abbreviation, explanation);
        }
    }
    public boolean hasAbbreviation(String abbreviation) {
        abbreviation = sanitizeString(abbreviation);
        if(this.abbreviation.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }
    public Set<String> getKey(){
        return this.abbreviation.keySet();
    }
    public String findExplanationFor(String abbreviation) {
        abbreviation = sanitizeString(abbreviation);
        if(this.hasAbbreviation(abbreviation)) {
            return this.abbreviation.get(abbreviation);
        }
        return "";
    }
    private static String sanitizeString(String string) {
        if(string == null) {
            return "";
        }
        string = string.toLowerCase();
        return string.trim();
    }
}
