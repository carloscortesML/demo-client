package com.missionlane.democlient

import com.missionlane.democlient.config.WebSecurityConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@Import(WebSecurityConfig::class)
@SpringBootApplication
class DemoClientApplication

fun main(args: Array<String>) {
    runApplication<DemoClientApplication>(*args)
}
