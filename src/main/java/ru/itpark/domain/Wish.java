package ru.itpark.domain;

import java.util.Arrays;

public class Wish {
    private String name;
    private String[] tags;
    private String type;
    private String link;
    private int price;

    public Wish(String name, String[] tags, String type, String link, int price) {
        this.name = name;
        this.tags = tags;
        this.type = type;
        this.link = link;
        this.price = price;
    }

    public String getName() { return name; }

    public String[] getTags() { return tags; }

    public String getType() { return type; }

    public String getLink() { return link; }

    public int getPrice() { return price; }

    @Override
    public String toString() {
        return "Wish{" +
                "name='" + name + '\'' +
                ", tags=" + Arrays.toString(tags) +
                ", type='" + type + '\'' +
                ", link='" + link + '\'' +
                ", price=" + price +
                '}';
    }
}

