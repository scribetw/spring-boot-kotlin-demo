package org.newstudio.demo.service

import org.newstudio.demo.model.Post
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

interface PostService {
    /**
     * 根據分頁設定取得貼文頁面。
     *
     * @param page 分頁設定
     * @return 貼文頁面
     */
    fun getPage(page: Pageable): Page<Post>
}