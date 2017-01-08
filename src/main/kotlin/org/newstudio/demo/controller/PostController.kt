package org.newstudio.demo.controller

import org.newstudio.demo.service.PostService
import org.newstudio.demo.service.PostUpdateService
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/post")
class PostController(
        private val postService: PostService,
        private val postUpdateService: PostUpdateService) {

    @GetMapping("/show")
    fun showPosts(model: Model, @PageableDefault(size = 10) pageRequest: Pageable): String {
        val page = postService.getPage(pageRequest)
        model.addAttribute("posts", page.content)
        model.addAttribute("page", page)
        return "show"
    }

    @GetMapping("/add")
    @ResponseBody
    fun add(): String {
        postUpdateService.addOne()
        return "OK>"
    }
}