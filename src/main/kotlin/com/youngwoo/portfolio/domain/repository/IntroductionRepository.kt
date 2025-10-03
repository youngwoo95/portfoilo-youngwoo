package com.youngwoo.portfolio.domain.repository

import com.youngwoo.portfolio.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository : JpaRepository<Introduction, Long> {


}