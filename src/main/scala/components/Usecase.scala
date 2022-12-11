
trait ServiceComponent:
    this: ConfigurationComponent with YoutubeApiClientComponent =>

    val service: Service
    class Service:
        def search(q: String) =
            val video = youtubeApiClient.searchVideo(q)
            video
