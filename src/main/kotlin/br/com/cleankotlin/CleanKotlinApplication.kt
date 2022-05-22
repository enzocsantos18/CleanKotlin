package br.com.cleankotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CleanKotlinApplication

fun main(args: Array<String>) {
    runApplication<CleanKotlinApplication>(*args)
}
