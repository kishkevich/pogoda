package by.itacademy.pogoda;

import java.time.LocalDate;

public class Weather {
    private String location;
    private LocalDate date;
    private int humidity;
    private String description;
    private int temp_max;
    private int temp_min;

    public String getLocation() {
        return location;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getHumidity() {
        return humidity;
    }

    public String getDescription() {
        return description;
    }

    public int getTemp_max() {
        return temp_max;
    }

    public int getTemp_min() {
        return temp_min;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTemp_max(int temp_max) {
        this.temp_max = temp_max;
    }

    public void setTemp_min(int temp_min) {
        this.temp_min = temp_min;
    }

    public static class Builder {
        Weather weather = new Weather();
        private String location;
        private LocalDate date;
        private int humidity;
        private String description;
        private int temp_max;
        private int temp_min;

        public static Builder createBuilder() {
            return new Builder();
        }

        public Builder setLocation(String location) {
            weather.location = location;
            return this;
        }



        public Builder setHumidity(String humidity) {
            weather.humidity=Integer.decode(humidity);
            return this;
        }

        public Builder setDescription(String description) {
            weather.description=description;
            return this;
        }

        public Builder setTemp_max(String temp_max) {
            weather.temp_max=Integer.decode(temp_max);
            return this;
        }

        public Builder setTemp_min(String temp_min) {
            weather.temp_min=Integer.decode(temp_min);
            return this;
        }

        public Weather buildWeather() {
            return weather;
        }
    }

    @Override
    public String toString() {
        return "Weather{" +
                "location='" + location + '\'' +
                ", date=" + date +
                ", humidity=" + humidity +
                ", description='" + description + '\'' +
                ", temp_max=" + temp_max +
                ", temp_main=" + temp_min +
                '}';
    }
}
