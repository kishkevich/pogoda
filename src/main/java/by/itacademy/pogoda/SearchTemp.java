package by.itacademy.pogoda;

import java.util.ArrayList;
import java.util.List;

public class SearchTemp {
    private List<Weather> list = new ArrayList<>();

    public List<Weather> find(List<Weather> weathers, int max_t, int min_t) {
        boolean flag = false;
        for (Weather weather : weathers) {
            if (weather.getTemp_max() <= max_t && weather.getTemp_max() >= min_t) {
                list.add(weather);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Ничего найдено");
        }
        return list;
    }

    public void show(List<Weather> list, int max_t, int min_t) {
        List<Weather> list1 = new ArrayList<>();
        list1.addAll(find(list, max_t, min_t));
        for (Weather weather : list1) {
            System.out.println(weather);
        }
    }
}
