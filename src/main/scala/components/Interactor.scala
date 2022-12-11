
trait InteractorComponent:
    this: ConfigurationComponent with ServiceComponent with YoutubeApiClientComponent =>

    val interactor: Interactor

    class Interactor:
        def search(name: String) =
            val obtainedName = service.search(name)
            Map("name" -> obtainedName)            
