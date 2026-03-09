plugins {
    kotlin("jvm") version "1.9.23"
    application
}

group = "com.fitstart"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}

application {
    mainClass.set("com.fitstart.AppKt")
}

application {
    mainClass.set("com.fitstart.AppKt")
}
