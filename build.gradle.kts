plugins {
    kotlin("jvm") version "1.5.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("io.kotest", "kotest-runner-junit5", "4.6.2")
    testImplementation("io.kotest", "kotest-framework-datatest", "4.6.2")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
