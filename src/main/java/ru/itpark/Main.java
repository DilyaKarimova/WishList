package ru.itpark;

import ru.itpark.domain.Wish;
import ru.itpark.repository.WishRepository;
import ru.itpark.service.WishService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        WishRepository repository = new WishRepository();
        WishService service = new WishService(repository);

        service.add("Война и мир",
                new String[]{"книга", "литература", "художественнная литература", "искусство"},
                "книга",
                "https://www.ozon.ru/context/detail/id/2183121/",
                529);

        service.add("Набор акварельных красок 10 цветов",
                new String[]{"краски", "искусство", "живопись", "хобби", "рисование"},
                "краски",
                "https://www.ozon.ru/context/detail/id/142097640/",
                2_790);

        List<Wish> all = service.findAllByName("Война и мир");
        System.out.println(all);


    }
}


