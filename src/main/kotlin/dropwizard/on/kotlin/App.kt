package dropwizard.on.kotlin

import io.dropwizard.Application
import io.dropwizard.setup.Environment

class App : Application<AppConfig>() {
    override fun run(configuration: AppConfig, environment: Environment) {
        println("Running ${configuration.name}!")
        val appResource = AppResource()
        environment.jersey().register(appResource)
    }

    fun main(args: Array<String>) {
        App().run(*args) // use collection as a varargs
    }
}