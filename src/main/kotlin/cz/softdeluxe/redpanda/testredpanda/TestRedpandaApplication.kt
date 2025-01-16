package cz.softdeluxe.redpanda.testredpanda

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestRedpandaApplication

fun main(args: Array<String>) {
    runApplication<TestRedpandaApplication>(*args)
}
