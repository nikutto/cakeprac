trait YoutubeApiClientComponent:
    // this: YoutubeApiConfigurationComponent =>
    this: ConfigurationComponent =>

    val youtubeApiClient: YoutubeApiClient

    class YoutubeApiClientImpl extends YoutubeApiClient:
        def searchVideo(q: String) = s"Bunbun hello, $q."


trait YoutubeApiClient:
    def searchVideo(q: String): String
