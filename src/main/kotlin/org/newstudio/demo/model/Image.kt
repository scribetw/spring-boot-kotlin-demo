package org.newstudio.demo.model

import javax.persistence.*

/**
 * 圖像
 */
@Entity
class Image(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,

        @ManyToOne
        @JoinColumn(name = "post_id")
        var post: Post? = null,

        var height: Int = 0,

        var width: Int = 0,

        @Column(name = "size_byte")
        var sizeByte: Long = 0,

        @Column(name = "file_name")
        var fileName: String = ""
)
