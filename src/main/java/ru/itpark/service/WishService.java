package ru.itpark.service;

import ru.itpark.domain.Wish;
import ru.itpark.repository.WishRepository;

import java.util.ArrayList;
import java.util.List;

public class WishService {
    private WishRepository repository;

    public WishService(WishRepository repository) {
        this.repository = repository;
    }

    public void add(
            String name,
            String[]tags,
            String type,
            String link,
            int price
    ) {

        Wish wish = new Wish(name, tags, type, link, price);
        repository.add(wish);
    }

    public List<Wish> findAllByName(String name) {
        List<Wish> result = new ArrayList<Wish>();
        name = name.toLowerCase();

        for (Wish wish : repository.getWishes()) {
            if (wish.getName().toLowerCase().contains(name)) {
                result.add(wish);
            }
        }
        return result;
    }

    public List<Wish> findAllByType(String type) {
        List<Wish> result = new ArrayList<Wish>();

        for (Wish wish : repository.getWishes()) {
            if (wish.getType().equalsIgnoreCase(type)) {
                result.add(wish);
            }
        }
        return result;
    }

}
