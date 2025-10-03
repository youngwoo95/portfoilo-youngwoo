package com.youngwoo.portfolio.domain.repository

import com.youngwoo.portfolio.domain.entity.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository

interface HttpInterfaceRepository : JpaRepository<HttpInterface, Long> {


}