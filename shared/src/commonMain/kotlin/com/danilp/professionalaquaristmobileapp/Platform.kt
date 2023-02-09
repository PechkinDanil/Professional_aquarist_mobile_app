package com.danilp.professionalaquaristmobileapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform