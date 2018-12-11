
// @GENERATOR:play-routes-compiler
// @SOURCE:/vagrant/316Proj/Milestone2/play-courses/conf/routes
// @DATE:Mon Dec 10 17:50:54 EST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:24
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def at(file:String): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:5
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def searchProfessorSortByName(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search-professor-sort-by-name/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:15
    def viewCommentsFilteredByCourse(course_name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "comment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("course_name", course_name)))
    }
  
    // @LINE:19
    def searchProfessorSortByDifficulty(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search-professor-sort-by-difficulty/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:9
    def searchAllProfessorSortByQuality(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search-all-professor-sort-by-quality")
    }
  
    // @LINE:18
    def searchProfessorSortByQuality(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search-professor-sort-by-quality/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:7
    def searchAllProfessor(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search-all-professor")
    }
  
    // @LINE:10
    def searchAllProfessorSortByDifficulty(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search-all-professor-sort-by-difficulty")
    }
  
    // @LINE:11
    def searchAllCourse(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search-all-course")
    }
  
    // @LINE:14
    def viewCommentsFilteredByProfessor(prof_name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "comment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("prof_name", prof_name)))
    }
  
    // @LINE:13
    def viewCommentsFilteredByProfessorAndCourse(prof_name:String, course_name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "comment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("prof_name", prof_name)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("course_name", course_name)))
    }
  
    // @LINE:6
    def viewProfessor(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "professor/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:8
    def searchAllProfessorSortByName(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search-all-professor-sort-by-name")
    }
  
    // @LINE:16
    def viewCommentsFilteredByCourseAndSemester(course_name:String, semester:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "comment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("course_name", course_name)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("semester", semester)))
    }
  
    // @LINE:5
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:12
    def viewCourse(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "course/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:22
    def searchCourse(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "search-course")
    }
  
    // @LINE:21
    def searchProfessor(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "search-professor")
    }
  
  }


}
