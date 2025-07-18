package com.keotsoft.bookpedia.book.data.dto

import com.keotsoft.bookpedia.book.data.dto.SearchedBookDto
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SearchResponseDto(
    @SerialName("docs") val results: List<SearchedBookDto>
)
