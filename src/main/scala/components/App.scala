
trait AppComponent:
    this: ConfigurationComponent =>
    val app: App
    class App:
        def run(): Unit = println(s"I am on [${configuration.envName}] environment.")
        def getEnvName() = configuration.envName
