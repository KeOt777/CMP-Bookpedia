package com.keotsoft.bookpedia.book.data.network

import com.keotsoft.bookpedia.book.data.dto.BookWorkDto
import com.keotsoft.bookpedia.book.data.dto.SearchResponseDto
import com.keotsoft.bookpedia.core.domain.DataError
import com.keotsoft.bookpedia.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>

    suspend fun getBookDetails(bookWorkId: String): Result<BookWorkDto, DataError.Remote>
}