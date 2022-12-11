
trait CliAppComponent:
    this: ConfigurationComponent with InteractorComponent with ServiceComponent with YoutubeApiClientComponent =>
    
    val cliApp: CliApp
    class CliApp:
        def run(): Unit = 
            println(s"[${configuration.envName}] Starting app.")
            print("Input video name: ")
            val name = scala.io.StdIn.readLine()
            val mp = interactor.search(name)
            val obtainedName = mp.get("name")
            val msg = obtainedName match {
                case Some(title) => 
                    println(s"You got video title:=\"$title\"")
                case _ =>
                    println("Missing videos.")
            }
            println("Finish app.")

        def getEnvName() = configuration.envName
