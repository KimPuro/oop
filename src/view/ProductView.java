package view;

import model.ProductDto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import service.UtilService;
import serviceImpl.UtilServiceImpl;


public class ProductView {
    public static void main(String[] args) {
        UtilService util = UtilServiceImpl.getInstance();
        List<ProductDto> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            ProductDto product = new ProductDto(i, "상품 " + i, "회사 ", util.createRandomInt(1000, 10000));
            list.add(product);
        }
        Stream<ProductDto> stream = list.stream();
        stream.forEach(p -> System.out.println(p));
    }
}