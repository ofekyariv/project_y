package yariv.pagi.project_y

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform