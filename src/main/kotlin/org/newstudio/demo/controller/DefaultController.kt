package org.newstudio.demo.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class DefaultController {
    @GetMapping("/")
    fun main() = "redirect:/post/show"
}
