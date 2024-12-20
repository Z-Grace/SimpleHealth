package entity;

public class UserAccount {
    private String username;
    private String preferences;
    private String allergies;

    public UserAccount(String username, String preferences, String allergies) {
        this.username = username;
        this.preferences = preferences;
        this.allergies = allergies;
    }

    // Getter and Setter for Username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter and Setter for Preferences
    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    // Getter and Setter for Allergies
    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }
}
