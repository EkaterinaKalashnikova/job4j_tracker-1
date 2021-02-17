package searchAnalog;

public class BaseSearchCriteria {
    private final String[] args;

    public BaseSearchCriteria(String[] args) {
        this.args = args;
    }

    public boolean valid() {
        if (this.args.length < 7) {
            throw new IllegalArgumentException("Root folder is null");
        }
        return true;
    }

    public String directory() {
        if (!this.args[0].equals("-d")) {
            throw new IllegalArgumentException("The string is not correct");
        }
        return this.args[1];
    }

    public String nameFile() {
        if (!this.args[2].equals("-n")) {
            throw new IllegalArgumentException("The string is not correct");
        }
        return this.args[3];
    }

    public String nameMarker() {
        if (this.args[4].equals("-o")) {
            return this.args[5];
        }
        return this.args[4];
    }

    public String output() {
        if (!this.args[5].equals("-o")) {
            throw new IllegalArgumentException("The string is not correct");
        }
        return this.args[6];
    }
}
