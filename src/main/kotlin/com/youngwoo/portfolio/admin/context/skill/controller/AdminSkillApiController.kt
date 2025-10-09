package com.youngwoo.portfolio.admin.context.skill.controller

import com.youngwoo.portfolio.admin.context.skill.form.SkillForm
import com.youngwoo.portfolio.admin.context.skill.service.AdminSkillService
import com.youngwoo.portfolio.admin.data.ApiResponse
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/admin/api/skills")
class AdminSkillApiController(
    private val adminSKillService: AdminSkillService
) {

    @PostMapping
    fun postLink(@RequestBody @Validated form: SkillForm): ResponseEntity<Any>{
        adminSKillService.save(form)
        return ApiResponse.successCreate()
    }

    @PutMapping("/{id}")
    fun putLink(@PathVariable id: Long, @RequestBody form: SkillForm) : ResponseEntity<Any>{
        adminSKillService.update(id,form)
        return ApiResponse.successUpdate()
    }

}