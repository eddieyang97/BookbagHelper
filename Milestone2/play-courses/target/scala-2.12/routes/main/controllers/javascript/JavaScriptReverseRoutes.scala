
// @GENERATOR:play-routes-compiler
// @SOURCE:/vagrant/316Proj/Milestone2/play-courses/conf/routes
// @DATE:Mon Dec 10 17:50:54 EST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {

  // @LINE:24
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def searchProfessorSortByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.searchProfessorSortByName",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search-professor-sort-by-name/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
    // @LINE:15
    def viewCommentsFilteredByCourse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.viewCommentsFilteredByCourse",
      """
        function(course_name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("course_name", course_name0))})
        }
      """
    )
  
    // @LINE:19
    def searchProfessorSortByDifficulty: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.searchProfessorSortByDifficulty",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search-professor-sort-by-difficulty/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
    // @LINE:9
    def searchAllProfessorSortByQuality: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.searchAllProfessorSortByQuality",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search-all-professor-sort-by-quality"})
        }
      """
    )
  
    // @LINE:18
    def searchProfessorSortByQuality: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.searchProfessorSortByQuality",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search-professor-sort-by-quality/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
    // @LINE:7
    def searchAllProfessor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.searchAllProfessor",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search-all-professor"})
        }
      """
    )
  
    // @LINE:10
    def searchAllProfessorSortByDifficulty: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.searchAllProfessorSortByDifficulty",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search-all-professor-sort-by-difficulty"})
        }
      """
    )
  
    // @LINE:11
    def searchAllCourse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.searchAllCourse",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search-all-course"})
        }
      """
    )
  
    // @LINE:14
    def viewCommentsFilteredByProfessor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.viewCommentsFilteredByProfessor",
      """
        function(prof_name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("prof_name", prof_name0))})
        }
      """
    )
  
    // @LINE:13
    def viewCommentsFilteredByProfessorAndCourse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.viewCommentsFilteredByProfessorAndCourse",
      """
        function(prof_name0,course_name1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("prof_name", prof_name0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("course_name", course_name1))})
        }
      """
    )
  
    // @LINE:6
    def viewProfessor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.viewProfessor",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "professor/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
    // @LINE:8
    def searchAllProfessorSortByName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.searchAllProfessorSortByName",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search-all-professor-sort-by-name"})
        }
      """
    )
  
    // @LINE:16
    def viewCommentsFilteredByCourseAndSemester: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.viewCommentsFilteredByCourseAndSemester",
      """
        function(course_name0,semester1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("course_name", course_name0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("semester", semester1))})
        }
      """
    )
  
    // @LINE:5
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:12
    def viewCourse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.viewCourse",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "course/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
    // @LINE:22
    def searchCourse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.searchCourse",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "search-course"})
        }
      """
    )
  
    // @LINE:21
    def searchProfessor: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.searchProfessor",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "search-professor"})
        }
      """
    )
  
  }


}
