package com.youngwoo.portfolio.admin.context.introduction.service

import com.youngwoo.portfolio.admin.data.TableDTO
import com.youngwoo.portfolio.domain.entity.Introduction
import com.youngwoo.portfolio.domain.repository.IntroductionRepository
import org.springframework.stereotype.Service

@Service
class AdminIntroductionService (
    private val introductionRepository: IntroductionRepository
){
    fun getIntroductionTable() : TableDTO{
        val classInfo = Introduction::class
        val entities = introductionRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }
}