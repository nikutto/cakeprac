object BetaRegistry extends Components:
    val configuration = new BetaConfiguration
    val youtubeApiClient: YoutubeApiClient = new YoutubeApiClientImpl
    val interactor: Interactor = new Interactor
    val service: Service = new Service
    val cliApp: CliApp = new CliApp
