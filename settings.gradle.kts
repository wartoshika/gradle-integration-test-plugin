plugins {
    id("com.gradle.enterprise").version("3.11.1")
}

rootProject.name = "integration-test-plugin"

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}
