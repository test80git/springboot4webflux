package ru.kuz.springboot4webflux;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.kuz.springboot4webflux.controller.RMyController;

import java.time.Duration;

@SpringBootApplication
public class SpringBoot4WebFluxApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringBoot4WebFluxApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot4WebFluxApplication.class, args);
        log.info("Start!");
        // в потоке main, синхронно
//        new RMyController().getItems().log().subscribe(System.out::println);

        // в параллельном режиме, ассинхронное
        new RMyController().getItems()
//                .log()
                .delayElements(Duration.ofMillis(500))
                .log()
                .subscribe(System.out::print).dispose();

        log.info("End!");
    }

}
