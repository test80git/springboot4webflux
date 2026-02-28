package ru.kuz.springboot4webflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class RMyController {

    @GetMapping("/test")
    public Flux<String> getItems() {
        return getItemsFromDatasource();
    }

    private Flux<String> getItemsFromDatasource() {
        return Flux.just("A", "B", "C", "D");
    }

}
