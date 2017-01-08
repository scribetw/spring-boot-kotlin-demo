package org.newstudio.demo.service.impl

import org.newstudio.demo.model.Post
import org.newstudio.demo.repository.PostRepository
import org.newstudio.demo.service.PostUpdateService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service("postUpdateService")
@Transactional(readOnly = false)
open class PostUpdateServiceImpl(
        private val postRepository: PostRepository) : PostUpdateService {

    override fun addOne() {
        val newPost = Post().apply {
            name = "Yr.Hwang"
            subject = "First post"
            content = "Hello, I'm Hwang."
            hostAddress = "127.0.0.1"
        }
        postRepository.save(newPost)
    }
}