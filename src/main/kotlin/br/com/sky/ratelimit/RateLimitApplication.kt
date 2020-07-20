package br.com.sky.ratelimit

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cache.annotation.EnableCaching

@EnableCaching
@SpringBootApplication
class RateLimitApplication

fun main(args: Array<String>) {
    SpringApplication.run(RateLimitApplication::class.java, *args)
}
