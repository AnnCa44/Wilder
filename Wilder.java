public class Wilder {
    // attributs
    private String firstname;
    private boolean aware;
    

    // constructeurs
    public Wilder(final String firstname, final boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    // getters
    public String getFirstName() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    // setters
    public void setFirstName(final String name) {
        this.firstname = name;
    }

    public void setAware(final boolean aware) {
        this.aware = aware;
    }
    
    // instance
    public String whoIam() {
        if (this.isAware()) {
            return "Je m'appelle " + this.getFirstName() + " et je suis aware";
        } else {
            return "Je m'appelle " + this.getFirstName() + " et je ne suis pas aware";
        }
    }
    
}


