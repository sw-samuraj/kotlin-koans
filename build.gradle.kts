plugins {
    kotlin("jvm") version "1.3.21"
}

repositories {
    mavenCentral()
}

sourceSets["main"].java.srcDir("src")
sourceSets["test"].java.srcDir("test")

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.google.guava:guava:16.0")
    testImplementation("junit:junit:4.12")
}