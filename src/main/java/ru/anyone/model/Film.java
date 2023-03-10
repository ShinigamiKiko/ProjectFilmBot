package ru.anyone.model;

public class Film {
    private final long id;
    private final String name;

    public Film(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
