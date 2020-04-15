// @GENERATOR:play-routes-compiler
// @SOURCE:D:/PlaySamples/multiplex-movie-management/conf/routes
// @DATE:Wed Apr 15 10:33:10 IST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
