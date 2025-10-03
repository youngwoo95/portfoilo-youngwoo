package com.youngwoo.portfolio.domain.entity

import jakarta.persistence.*
import jakarta.servlet.http.HttpServletRequest


@Entity

class HttpInterface(
    httpServletRequest: HttpServletRequest
) : BaseEntity() {

    @Id
    /* PK 임을 명시 */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "http_interface_id")
    var id: Long? = null

    var cookies: String? = httpServletRequest.cookies
    ?.map { "${it.name}:${it.value}" }
    ?.toString()

    var referer: String? = httpServletRequest.getHeader("referer")

    var localAddr: String? = httpServletRequest.localAddr

    var remoteAddr: String? = httpServletRequest.remoteAddr

    var remoteHost: String? = httpServletRequest.remoteHost

    var requestUri: String? = httpServletRequest.requestURI

    var userAgent: String? = httpServletRequest.getHeader("userAgent")

}