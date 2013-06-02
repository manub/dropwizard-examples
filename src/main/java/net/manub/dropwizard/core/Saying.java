package net.manub.dropwizard.core;

public class Saying {

    private final long id;
    private final String content;

    public Saying(long id, String content) {
        this.content = content;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
