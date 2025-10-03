package com.youngwoo.portfolio.domain.repository

import com.youngwoo.portfolio.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository

interface AchievementRepository : JpaRepository<Achievement, Long> {


}