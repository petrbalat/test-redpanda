package cz.softdeluxe.redpanda.testredpanda.api

import cz.softdeluxe.redpanda.testredpanda.dto.OrderDto
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ApiController(private val kafkaTemplate: KafkaTemplate<String, OrderDto>) {

    @PostMapping
    fun put(@RequestBody order: OrderDto): Unit {
        kafkaTemplate.send("orders", order.id.toString(), order)
    }
}