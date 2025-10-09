package com.youngwoo.portfolio.admin.context.introduction.controller

import com.youngwoo.portfolio.admin.context.achievement.service.AdminAchievementService
import com.youngwoo.portfolio.admin.context.introduction.service.AdminIntroductionService
import com.youngwoo.portfolio.admin.data.DateFormElementDTO
import com.youngwoo.portfolio.admin.data.FormElementDTO
import com.youngwoo.portfolio.admin.data.SelectFormElementDTO
import com.youngwoo.portfolio.admin.data.TextFormElementDTO
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/admin/introduction")
class AdminIntroductionViewController(
    private val adminIntroductionService: AdminIntroductionService
) {
    @GetMapping
    fun introduction(model: Model):String{
        val formElements = listOf<FormElementDTO>(
            TextFormElementDTO("content",10),
            SelectFormElementDTO("isActive",2, listOf(true.toString(), false.toString())),
        )
        model.addAttribute("formElements", formElements)

        val table = adminIntroductionService.getIntroductionTable()
        model.addAttribute("table",table)
        model.addAttribute("detailTable",null)

        val pageAttributes = mutableMapOf<String, Any>(
            Pair("menuName", "Index"),
            Pair("pageName", table.name),
            Pair("editable", true),
            Pair("deletable", false),
            Pair("hasDetails", false),
        )
        model.addAllAttributes(pageAttributes)

        return "admin/page-table"
    }
}