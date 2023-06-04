package pl.camp.it.spring.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.camp.it.spring.boot.model.Data;

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

    @RequestMapping(path = "/form", method = RequestMethod.GET)
    public String form() {
        return "form";
    }

    @RequestMapping(path = "/form", method = RequestMethod.POST)
    public String formReceive(@RequestParam String login,
                              @RequestParam String pass) {
        System.out.println(login);
        System.out.println(pass);
        return "strona2";
    }

    @RequestMapping(path = "/form2", method = RequestMethod.GET)
    public String form2(Model model) {
        model.addAttribute("dataObject", new Data());
        return "form/form2";
    }

    @RequestMapping(path = "/form2", method = RequestMethod.POST)
    public String form2(@ModelAttribute Data data) {
        System.out.println(data.getLogin());
        System.out.println(data.getName());
        System.out.println(data.getSurname());
        System.out.println(data.getAge());
        System.out.println(data.getCity());
        System.out.println(data.getStreet());
        System.out.println(data.getPass());
        return "strona2";
    }
}
