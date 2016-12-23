package com.asy.test.mapstruct;

import com.asy.test.mapstruct.dto.CarDTO;
import com.asy.test.mapstruct.mapper.CarMapper;
import com.asy.test.mapstruct.model.Car;
import com.asy.test.mapstruct.model.CarType;
import com.asy.test.mapstruct.model.Price;

/**
 * Created by asy
 */
public class MapstructTest {

    public static void main(String[] args) {
        Price price = new Price();
        price.setTotal(12.3f);
        Car car = new Car( "Morris", 5, CarType.HONDA, price);

        //when
        CarDTO carDto = CarMapper.INSTANCE.carToCarDto(car);

        System.out.println(carDto.getName());
        System.out.println(carDto.getType());
        System.out.println(carDto.getSeatCount());
        System.out.println(carDto.getPrice());

    }

}
