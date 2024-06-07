plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.testng:testng:7.10.2")

}

tasks.test {
    useTestNG {
        suites("src/test/resources/testng.xml")
    }

    testLogging {
        events("passed", "skipped", "failed")
        showStandardStreams = true // Ensure standard output is shown
    }
}