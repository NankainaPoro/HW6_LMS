package vakulenko.hw6_lms;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.resultTextView);

        // Создаем объекты автомобилей
        Automobile car = new Car();
        Automobile truck = new Truck();
        Automobile minibus = new Minibus();

        // Формируем информацию для вывода
        String info = "Легковой автомобиль:\n" + car.getInfo() +
                "\nГрузовой автомобиль:\n" + truck.getInfo() +
                "\nМикроавтобус:\n" + minibus.getInfo();

        // Вывод информации на экран
        resultTextView.setText(info);
    }

    // Интерфейс автомобиля
    interface Automobile {
        String getInfo();
    }

    // Класс легкового автомобиля
    class Car implements Automobile {
        int capacity = 5;
        int maxSpeed = 210;
        double mass = 1.2;

        public String getInfo() {
            return "Вместимость: " + capacity + " человек\nМаксимальная скорость: " + maxSpeed +
                    " км/ч\nМасса: " + mass + " тонны";
        }
    }

    // Класс грузового автомобиля
    class Truck implements Automobile {
        int capacity = 3;
        int maxSpeed = 170;
        double mass = 3.0;

        public String getInfo() {
            return "Вместимость: " + capacity + " человек\nМаксимальная скорость: " + maxSpeed +
                    " км/ч\nМасса: " + mass + " тонн";
        }
    }

    // Класс микроавтобуса
    class Minibus implements Automobile {
        int capacity = 8;
        int maxSpeed = 180;
        double mass = 1.6;

        public String getInfo() {
            return "Вместимость: " + capacity + " человек\nМаксимальная скорость: " + maxSpeed +
                    " км/ч\nМасса: " + mass + " тонн";
        }
    }
}