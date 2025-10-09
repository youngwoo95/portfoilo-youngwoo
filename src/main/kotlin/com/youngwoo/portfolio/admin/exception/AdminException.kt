package com.youngwoo.portfolio.admin.exception

import org.springframework.http.HttpStatus
import java.lang.RuntimeException

abstract class AdminException(
    httpStatus: HttpStatus,
    message: String
) : RuntimeException(message) {
    val httpstatus: HttpStatus = httpStatus;
}

class AdminBadRequestException(message: String): AdminException(
    httpStatus = HttpStatus.BAD_REQUEST,
    message = message
) {

}

class AdminInternalServerErrorException(message: String): AdminException(
    httpStatus = HttpStatus.INTERNAL_SERVER_ERROR,
    message = message
){

}