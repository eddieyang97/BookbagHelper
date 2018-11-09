
// @GENERATOR:play-routes-compiler
// @SOURCE:/vagrant/play-courses/conf/routes
// @DATE:Thu Nov 08 20:09:47 EST 2018


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
