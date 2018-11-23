package ru.itpark.repository;

import ru.itpark.domain.Wish;

import java.util.ArrayList;
import java.util.List;

public class WishRepository {
    private List<Wish> wishes = new ArrayList<Wish>();

    public void add(Wish wish) {
        wishes.add(wish);
    }

    public List<Wish> getWishes() {
        return wishes;
    }
}
