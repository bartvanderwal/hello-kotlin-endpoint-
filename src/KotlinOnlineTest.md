# FizzBuzzTestKotlin

```kotlin
package oose.hellokotlinendpoint

class FizzBuzzTestKotlin {

// Tests
// The following example works for JVM only
import org.junit.Test
import kotlin.test.*

    class SampleTest {
        @Test
        fun `test Fizzbuzz werkt voor 1`() {
            val expected = "1"
            val actual = fizzbuzz(1)
            assertEquals(expected, actual)
        }

        @Test
        fun `test Fizzbuzz werkt voor 2`() {
            val expected = "2"
            val actual = fizzbuzz(2)
            assertEquals(expected, actual)
        }

        @Test
        fun `test Fizzbuzz werkt voor 3`() {
            val expected = "Fizz"
            val actual = fizzbuzz(3)
            assertEquals(expected, actual)
        }

        @Test
        fun `test Fizzbuzz werkt voor 5`() {
            val expected = "Buzz"
            val actual = fizzbuzz(5)
            assertEquals(expected, actual)
        }

        @Test
        fun `test Fizzbuzz werkt voor 15`() {
            val expected = "FizzBuzz"
            val actual = fizzbuzz(15)
            assertEquals(expected, actual)
        }

        @Test
        fun `test hele rij handmatig voor fizzbuzz`() {
            val expected = "Hello, Fizzbuzz!\n 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16"
            val actual = org()
            assertEquals(expected, actual)
        }

    }

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

```
