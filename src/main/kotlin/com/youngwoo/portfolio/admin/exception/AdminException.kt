package com.youngwoo.portfolio.admin.exception

import org.springframework.http.HttpStatus
import java.lang.RuntimeException

abstract class AdminException(
    httpStatus: HttpStatus,
    message: String
) : RuntimeException(message) {
    val httpstatus: HttpStatus = httpStatus;
}