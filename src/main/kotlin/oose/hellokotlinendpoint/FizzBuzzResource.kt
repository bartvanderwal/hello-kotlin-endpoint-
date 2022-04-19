package oose.hellokotlinendpoint

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FizzBuzzResource {

    // TODO: Refactor fizzbuzz logica naar aparte FizzBuzz service die 'dronkenheid level' bijhoudt
    // en game state opslaat in een database (via repository).

     @GetMapping
    fun fizzBuzz(token: String, gameCounter: Int): String {
        return gameCounter.toString();
    }
}