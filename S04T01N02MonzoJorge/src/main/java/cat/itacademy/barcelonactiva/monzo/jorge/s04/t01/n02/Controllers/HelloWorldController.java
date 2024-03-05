package cat.itacademy.barcelonactiva.monzo.jorge.s04.t01.n02.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
    @RestController
    public class HelloWorldController {

        @GetMapping("/HelloWorld")
        public String Grettings(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name) {
            return "Hola " + name + ". Estás ejecutando un programa Gradle";
        }

        @GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{name}"})
        public String Grettings2(@PathVariable(value="name", required = false) Optional<String> name) {
            if (name.isEmpty()) {
                return "Hola, Desconocido. Estás ejecutando un projecto Gradle";
            } else {
                return "Hola, " +name+ ". Estás ejecutando un projecto Gradle";
            }
        }
    }

