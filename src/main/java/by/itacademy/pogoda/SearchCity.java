package by.itacademy.pogoda;

import java.util.ArrayList;
import java.util.List;

public class SearchCity {
    private List<Weather> list = new ArrayList<>();

    public List<Weather> find(List<Weather> weathers, String name) {
        boolean flag = false;
        for (Weather weather : weathers) {
            if (weather.getDescription().equals(name)) {
                list.add(weather);
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Ничего не найдено");
        }
        return list;
    }

    public void show(List<Weather> list, String name) {
        List<Weather> list1 = new ArrayList<>();
        list1.addAll(find(list, name));
        for (Weather weather : list1) {
            System.out.println(weather);
        }
    }

}
