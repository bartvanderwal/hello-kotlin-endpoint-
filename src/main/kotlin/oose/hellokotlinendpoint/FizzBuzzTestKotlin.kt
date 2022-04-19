package oose.hellokotlinendpoint

class FizzBuzzTestKotlin {



    // Sources
    fun fizzbuzz(input: Int): String {
        if (input%15==0) {
            return "FizzBuzz"
        }
        if (input%3==0) {
            return "Fizz"
        }
        if (input%5==0) {
            return "Buzz"
        }
        return input.toString()
    }

    fun org(): String {
        var output = "Hello, FizzBuzz!\n"
        val max = 16
        for (i in 1..max) {           // Loop over a range from 0 to 10
            // print("$i: ")
            output += fizzbuzz(i) + ", "
        }
        return output.substring(0, output.length-2)
    }
}