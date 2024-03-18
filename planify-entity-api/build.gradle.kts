plugins {
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")
    implementation("org.springframework.data:spring-data-jpa:3.1.6")
    implementation("org.hibernate.orm:hibernate-core:6.2.6.Final")
    implementation("io.hypersistence:hypersistence-utils-hibernate-62:3.5.1")
    implementation("org.springframework.boot:spring-boot-starter-security:3.1.5")
}

tasks.test {
    useJUnitPlatform()
}
