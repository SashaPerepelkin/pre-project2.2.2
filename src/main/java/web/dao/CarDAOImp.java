package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImp implements CarDAO {
    private List<Car> carsList;

    {
        carsList = new ArrayList<>();
        carsList.add(new Car("BMW 8", "sport car", 2020));
        carsList.add(new Car("McLaren 765LT", "sport car", 2021));
        carsList.add(new Car("Lexus Rx 450h", "SUV", 2022));
        carsList.add(new Car("ЛиАЗ  4292", "bus", 2015 ));
        carsList.add(new Car("JAC K7", "trac", 2019));
    }


    @Override
    public List<Car> returnGivenNumberCars(int n) {
        if(n < carsList.size()) {
            return carsList.stream().limit(n).collect(Collectors.toList());
        }
        return carsList;
    }
}
