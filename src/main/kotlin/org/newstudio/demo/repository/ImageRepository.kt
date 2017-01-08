package org.newstudio.demo.repository

import org.newstudio.demo.model.Image
import org.springframework.data.repository.CrudRepository

interface ImageRepository : CrudRepository<Image, Long>