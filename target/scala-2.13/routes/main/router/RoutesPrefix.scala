// @GENERATOR:play-routes-compiler
// @SOURCE:D:/VSCode/SyncAppsTest/conf/routes
// @DATE:Mon Oct 12 21:34:32 CST 2020


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
