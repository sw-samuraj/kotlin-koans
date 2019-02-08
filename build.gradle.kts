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
    testImplementation("org.junit.jupiter:junit-jupiter:5.4.0")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
