
package cat.itacademy.barcelonactiva.monzo.jorge.s04.t01.n01.Controllers;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String Grettings(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name) {
        return "Hola " + name + ". Estás ejecutando un programa Maven";
    }

    @GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{name}"})
    public String Grettings2(@PathVariable(value="name", required = false) Optional <String> name) {
        if (name.isEmpty()) {
            return "Hola, Desconocido. Estás ejecutando un projecto Maven";
        } else {
            return "Hola, " +name+ ". Estás ejecutando un projecto Maven";
        }
    }

}
