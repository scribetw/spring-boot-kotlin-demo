package org.newstudio.demo.model

import java.util.*
import javax.persistence.*

/**
 * 貼文。
 */
@Entity
class Post(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,

        var name: String = "",

        var subject: String = "",

        var content: String = "",

        var date: Date = Date(),

        @Column(name = "host_address")
        var hostAddress: String = "",

        @OneToMany(mappedBy = "post")
        var images: List<Image> = emptyList()
)
