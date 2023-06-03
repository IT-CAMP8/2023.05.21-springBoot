package pl.camp.it.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public String metoda3(@RequestParam("name") String n,
                          @RequestParam String surname,
                          @RequestParam int age) {
        System.out.println(n);
        System.out.println(surname);
        System.out.println(age);
        return "strona2";
    }

    @RequestMapping(path = "/test/{name}/{surname}/{age}", method = RequestMethod.GET)
    public String metoda4(@PathVariable String name,
                          @PathVariable String surname,
                          @PathVariable int age) {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
        return "strona2";
    }

    @RequestMapping(path = "test2/{name}/{surname}", method = RequestMethod.GET)
    public String metoda5(@PathVariable String name,
                          @PathVariable String surname,
                          @RequestParam int age) {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);

        return "strona2";
    }
}
