plugins {
    id("java-library")
    id("org.springframework.boot")
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":application"))
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    runtimeOnly("org.postgresql:postgresql") // Supabase uses PostgreSQL
}