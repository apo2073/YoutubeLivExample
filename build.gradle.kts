plugins {
    kotlin("jvm") version "2.0.0"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "kr.apo2073"
version = "1.1.1"

repositories {
    mavenCentral()
    maven("https://jitpack.io") {
        name = "jitpack"
    }
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.github.apo2073:YouTubeLiv:1.1.1")

    implementation("com.google.api-client:google-api-client:1.33.0")
    implementation("com.google.http-client:google-http-client:1.39.2")
    implementation("com.google.http-client:google-http-client-jackson2:1.39.2")
    implementation("com.google.oauth-client:google-oauth-client-jetty:1.23.0")
}

tasks.test {
    useJUnitPlatform()
}

tasks.shadowJar {
    archiveFileName.set("YouTubeLivSample-${version}.jar")
    manifest {
        attributes["Main-Class"] = "kr.apo2073.MainKt"
    }
}

kotlin {
    jvmToolchain(17)
}
