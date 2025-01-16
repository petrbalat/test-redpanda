package cz.softdeluxe.redpanda.testredpanda.dto

import java.math.BigDecimal

data class OrderDto(val id: Long, val name: String, val price: BigDecimal)
