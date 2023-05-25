package pl.camp.it.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SimpleController {

    @RequestMapping(path = "/adres", method = RequestMethod.GET)
    public String metoda() {
        System.out.println("no kurde zadzialalo !!!");
        return "strona";
    }

    @RequestMapping(path = "/cos", method = RequestMethod.GET)
    public String metoda2() {
        System.out.println("Metoda 2 !!!");
        return "strona2";
    }
}
