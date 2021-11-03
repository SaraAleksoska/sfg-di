package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    //sega tuka ne koristime @Autowired zaso nema potreba koga rabotime so konstruktor
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
       //toa @Qualifier e za da znae koj kontroler da go koristi
       //zaso inace se buni koa ima poveke bean i treba da mu kazeme koe da go koristi
       //ako ne koristime @Qualifier togas treba da napravime @Primary Bean
       //ako nema Qualifier togas ke se injectne Primary Bean
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
