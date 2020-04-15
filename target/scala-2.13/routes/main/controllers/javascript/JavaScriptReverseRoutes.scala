// @GENERATOR:play-routes-compiler
// @SOURCE:D:/PlaySamples/multiplex-movie-management/conf/routes
// @DATE:Wed Apr 15 10:33:10 IST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:34
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseSocketController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SocketController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sock"})
        }
      """
    )
  
    // @LINE:25
    def socket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SocketController.socket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sock/chat"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseMovieController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MovieController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "movie/create"})
        }
      """
    )
  
    // @LINE:9
    def listAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MovieController.listAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "movies"})
        }
      """
    )
  
    // @LINE:14
    def deleteMovie: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MovieController.deleteMovie",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "movie/delete" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:30
    def searchByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MovieController.searchByName",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "movie/searchByName" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name0)])})
        }
      """
    )
  
    // @LINE:12
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MovieController.update",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "movie/updateMovie"})
        }
      """
    )
  
    // @LINE:10
    def createMovie: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MovieController.createMovie",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "movie/create"})
        }
      """
    )
  
    // @LINE:11
    def updateMovie: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MovieController.updateMovie",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "movie/update" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseMultiplexController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MultiplexController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "multiplex/create"})
        }
      """
    )
  
    // @LINE:18
    def createcMultiplex: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MultiplexController.createcMultiplex",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "multiplex/create"})
        }
      """
    )
  
    // @LINE:17
    def listAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MultiplexController.listAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "multiplexs"})
        }
      """
    )
  
    // @LINE:21
    def deleteMultiplex: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MultiplexController.deleteMultiplex",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "multiplex/delete" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:31
    def searchByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MultiplexController.searchByName",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "multiplex/searchByName" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name0)])})
        }
      """
    )
  
    // @LINE:20
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MultiplexController.update",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "multiplex/updateMovie"})
        }
      """
    )
  
    // @LINE:19
    def updateMultiplex: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MultiplexController.updateMultiplex",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "multiplex/update" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
  }

  // @LINE:27
  class ReverseSocketControllerMultiplex(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SocketControllerMultiplex.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sockMultiplex"})
        }
      """
    )
  
    // @LINE:28
    def socket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SocketControllerMultiplex.socket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sockMultiplex/chat"})
        }
      """
    )
  
  }


}
