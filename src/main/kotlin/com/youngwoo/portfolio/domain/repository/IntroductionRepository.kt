package com.youngwoo.portfolio.domain.repository

import com.youngwoo.portfolio.domain.entity.Achievement
import com.youngwoo.portfolio.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository : JpaRepository<Introduction, Long> {

    fun findAllByIsActive(isActive: Boolean) : List<Introduction>

}