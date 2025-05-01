plugins {
    kotlin("jvm") version "1.9.22" // Версия Kotlin
    application // Только если у вас есть main-класс
}

repositories {
    mavenCentral()
}

dependencies {
    // Основные зависимости Kotlin
    implementation(kotlin("stdlib"))

    // Kotlin Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0") // Последняя версия на момент 2025

    // Тестовые зависимости
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    testImplementation("io.mockk:mockk:1.13.8")
}

tasks.test {
    useJUnitPlatform()
}

// Только если у вас есть main-класс
application {
    mainClass.set("main.kotlin.MainKt") // Замените на ваш главный класс
}