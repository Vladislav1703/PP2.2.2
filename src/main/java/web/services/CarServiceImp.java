package web.services;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService{
    private List<Car> cars = new ArrayList<>();

    {
        Car car1 = new Car("bmw", 6, "blue");
        Car car2 = new Car("mazda", 2020, "red");
        Car car3 = new Car("lamborghini", 1913, "yellow");
        Car car4 = new Car("ferrari", 3000, "green");
        Car car5 = new Car("lada", 2109, "pink");
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
    }

    @Override
    public List<Car> getCars(Integer carsCount) {
        if (carsCount >= 5 || carsCount == 0) {
            return cars;
        }
        return cars.subList(0, carsCount);
    }
}
