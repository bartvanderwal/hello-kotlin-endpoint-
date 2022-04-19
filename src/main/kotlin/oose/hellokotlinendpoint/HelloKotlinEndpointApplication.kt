package oose.hellokotlinendpoint

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class HelloKotlinEndpointApplication

fun main(args: Array<String>) {
    runApplication<HelloKotlinEndpointApplication>(*args)

    val condition = true                        // Try replacing `true` with `false` and run the sample!
    val message = reply(condition)              // The result is nullable
    // println(message.uppercase())             // This line doesn't compile

    println(message?.replace("fine", "okay"))   // Access a nullable value in a safe manner
    if (message != null) {                      // If you check that the type is right,
        println(message.uppercase())             // the compiler will smart-cast it for you
    }

    val nonNull: String =                                  // If the null-case throws an error,
        reply(condition = true) ?: error("gaat mis")  // Kotlin can infer that the result is non-null
    println(nonNull)
}

fun reply(condition: Boolean): String? =          // Nullability is part of Kotlin’s type system -> billion dollar problem
    if (condition) "I'm fine" else null

@RestController
class HalloWereldResource(val service: BerichtService) {

    @GetMapping
    fun halloWereld(): TestBerichtDTO {
        return service.haalLaatsteBerichtOp()
    }
}

data class TestBerichtDTO(val titel: String, val inhoud: String?) {
}

