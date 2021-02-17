package ru.job4j.search;

public class ArgZip {
    private final String[] args;

    public ArgZip(String[] args) {
        this.args = args;
    }

    public boolean valid() {
        if (this.args.length < 6) {
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

    public String exclude() {
        if (!this.args[2].equals("-e")) {
            throw new IllegalArgumentException("The string is not correct");
        }
        return this.args[3];
    }

    public String output() {
        if (!this.args[4].equals("-o")) {
            throw new IllegalArgumentException("The string is not correct");
        }
        return this.args[5];
    }
}
