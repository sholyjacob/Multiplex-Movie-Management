// @GENERATOR:play-routes-compiler
// @SOURCE:D:/PlaySamples/multiplex-movie-management/conf/routes
// @DATE:Wed Apr 15 10:33:10 IST 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSocketController SocketController = new controllers.ReverseSocketController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMovieController MovieController = new controllers.ReverseMovieController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMultiplexController MultiplexController = new controllers.ReverseMultiplexController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSocketControllerMultiplex SocketControllerMultiplex = new controllers.ReverseSocketControllerMultiplex(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSocketController SocketController = new controllers.javascript.ReverseSocketController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMovieController MovieController = new controllers.javascript.ReverseMovieController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMultiplexController MultiplexController = new controllers.javascript.ReverseMultiplexController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSocketControllerMultiplex SocketControllerMultiplex = new controllers.javascript.ReverseSocketControllerMultiplex(RoutesPrefix.byNamePrefix());
  }

}
