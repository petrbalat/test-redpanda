package cz.softdeluxe.redpanda.testredpanda.listener

import cz.softdeluxe.redpanda.testredpanda.dto.OrderDto
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class OrderListener {

    @KafkaListener(topics = ["orders"], groupId = "test-redpanda")
    fun listen(orderDto: OrderDto): Unit {
        println("Received order $orderDto")
    }

}