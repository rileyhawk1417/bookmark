package org.librarian.audioplayer

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform