
// @GENERATOR:play-routes-compiler
// @SOURCE:/vagrant/316Proj/Milestone2/play-courses/conf/routes
// @DATE:Mon Dec 10 17:50:54 EST 2018


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
