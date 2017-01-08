package org.newstudio.demo.service.impl

import org.newstudio.demo.repository.PostRepository
import org.newstudio.demo.service.PostService
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service("postService")
@Transactional(readOnly = true)
open class PostServiceImpl(
        private val postRepository: PostRepository) : PostService {

    override fun getPage(page: Pageable) = postRepository.findAll(page)!!
}