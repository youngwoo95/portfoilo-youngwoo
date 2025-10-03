package com.youngwoo.portfolio.domain.repository

import com.youngwoo.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository : JpaRepository<Link, Long> {


}