
// @GENERATOR:play-routes-compiler
// @SOURCE:/vagrant/316Proj/play-courses/conf/routes
// @DATE:Thu Nov 08 22:39:18 EST 2018


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
