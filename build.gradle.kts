plugins {
    kotlin("jvm") version "2.0.0"
}

group = "kr.apo2073"
version = "1.1.1"

repositories {
    mavenCentral()
    maven("https://jitpack.io") {
        name="jitpack"
    }
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.github.apo2073:YouTubeLiv:1.1.1")
}

tasks.test {
    useJUnitPlatform()
}
tasks.jar {
    archiveFileName.set("YouTubeLibSample-${version}.jar")
}
kotlin {
    jvmToolchain(17)
}