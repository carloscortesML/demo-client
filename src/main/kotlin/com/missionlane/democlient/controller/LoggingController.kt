package com.missionlane.democlient.controller

import mu.KotlinLogging
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LoggingController {

    private val logger = KotlinLogging.logger {}

    @GetMapping("/log")
    fun logs(): ResponseEntity<String> {
        logger.trace("This is a TRACE level message")
        logger.debug("This is a DEBUG level message")
        logger.info("This is an INFO level message")
        logger.warn("This is a WARN level message")
        logger.error("This is an ERROR level message")
        return ResponseEntity.ok("See the log for details")
    }
}