// @GENERATOR:play-routes-compiler
// @SOURCE:D:/VSCode/SyncAppsTest/conf/routes
// @DATE:Mon Oct 12 21:34:32 CST 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseSyncAppsController SyncAppsController = new controllers.ReverseSyncAppsController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseSyncAppsController SyncAppsController = new controllers.javascript.ReverseSyncAppsController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
