package oose.hellokotlinendpoint

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class FizzBuzzKotlinTest {


    val sut = FizzBuzzer();

    @Test
    fun `test Fizzbuzz werkt voor 1`() {
        val expected = "1"
        val actual = sut.fizzbuzz(1)
        assertEquals(expected, actual)
    }

    @Test
    fun `test Fizzbuzz werkt voor 2`() {
        val expected = "2"
        val actual = sut.fizzbuzz(2)
        assertEquals(expected, actual)
    }

    @Test
    fun `test Fizzbuzz werkt voor 3`() {
        val expected = "Fizz"
        val actual = sut.fizzbuzz(3)
        assertEquals(expected, actual)
    }

    @Test
    fun `test Fizzbuzz werkt voor 5`() {
        val expected = "Buzz"
        val actual = sut.fizzbuzz(5)
        assertEquals(expected, actual)
    }

    @Test
    fun `test Fizzbuzz werkt voor 15`() {
        val expected = "FizzBuzz"
        val actual = sut.fizzbuzz(15)
        assertEquals(expected, actual)
    }

//    @Test
//    fun `test hele rij handmatig voor fizzbuzz`() {
//        val expected = "Hello, Fizzbuzz!\n 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16"
//        val actual = sut.org()
//        assertEquals(expected, actual)
//    }
}