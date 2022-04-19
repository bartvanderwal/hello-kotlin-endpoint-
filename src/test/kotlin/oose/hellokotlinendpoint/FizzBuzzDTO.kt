package oose.hellokotlinendpoint

data class FizzBuzzDTO(var aantalFouten: Int, var huidigeRonde: Int, val config: FizzBuzzConfig) {

}

data class FizzBuzzConfig(val spelernaam: String) {

    constructor() : this("Speler 1") {
        println("Default constructor aangeroepen, naam op ${this.spelernaam} gezet!")
    }
}
