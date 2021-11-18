package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        //najdobro i najcista implementacija e so controller
        controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}