package com.youngwoo.portfolio.admin.context.experience.service

import com.youngwoo.portfolio.admin.data.TableDTO
import com.youngwoo.portfolio.admin.exception.AdminBadRequestException
import com.youngwoo.portfolio.domain.entity.Experience
import com.youngwoo.portfolio.domain.entity.ExperienceDetail
import com.youngwoo.portfolio.domain.repository.ExperienceRepository
import org.springframework.stereotype.Service

@Service
class AdminExperienceService(
    private val experienceRepository: ExperienceRepository
) {
    fun getExperienceTable(): TableDTO{
        val classInfo = Experience::class
        val entities = experienceRepository.findAll()

        return TableDTO.from(classInfo, entities,"details")
    }

    fun getExperienceDetailTable(id:Long?): TableDTO{
        val classInfo = ExperienceDetail::class
        val entities = if(id != null) experienceRepository.findById(id)
            .orElseThrow{throw AdminBadRequestException("ID ${id}에 해당하는 데이터를 찾을 수가 없습니다.")}
            .details else emptyList()

        return TableDTO.from(classInfo, entities)
    }

}