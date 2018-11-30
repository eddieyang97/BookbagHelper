
// @GENERATOR:play-routes-compiler
// @SOURCE:/vagrant/316Proj/Milestone2/play-courses/conf/routes
// @DATE:Thu Nov 29 21:45:26 EST 2018


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
