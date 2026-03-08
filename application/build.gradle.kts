plugins {
    id("java-library")
}

dependencies {
    implementation(project(":domain"))
    implementation("org.springframework:spring-context:6.1.3")
    // Application layer dependencies
}