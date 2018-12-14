
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object searchCour extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.CourseDB.CourseInfo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(courses: List[models.CourseDB.CourseInfo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.45*/("""

"""),_display_(/*3.2*/main("All Matched Courses")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/(""" """)))}/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
  """),format.raw/*4.3*/("""<p>
  <a href=""""),_display_(/*5.13*/routes/*5.19*/.Application.index()),format.raw/*5.39*/("""">Back to Main Page</a>
  </p>
  <p>Click on course below to view more information:
    <ul>
      """),_display_(/*9.8*/for(course <- courses) yield /*9.30*/ {_display_(Seq[Any](format.raw/*9.32*/("""
        """),format.raw/*10.9*/("""<li><a href=""""),_display_(/*10.23*/routes/*10.29*/.Application.viewCourse(course.name)),format.raw/*10.65*/("""">"""),_display_(/*10.68*/course/*10.74*/.courseNumber),format.raw/*10.87*/(""" """),format.raw/*10.88*/(""": """),_display_(/*10.91*/course/*10.97*/.name),format.raw/*10.102*/("""</a></li>
      """)))}),format.raw/*11.8*/("""
    """),format.raw/*12.5*/("""</ul>
  </p>
""")))}))
      }
    }
  }

  def render(courses:List[models.CourseDB.CourseInfo]): play.twirl.api.HtmlFormat.Appendable = apply(courses)

  def f:((List[models.CourseDB.CourseInfo]) => play.twirl.api.HtmlFormat.Appendable) = (courses) => apply(courses)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Dec 11 13:48:21 EST 2018
                  SOURCE: /vagrant/316Proj/Milestone2/play-courses/app/views/searchCour.scala.html
                  HASH: 2f0e18540cbaa88a670813e434262d66b7829e36
                  MATRIX: 979->1|1117->44|1145->47|1180->74|1219->76|1239->78|1278->80|1307->83|1349->99|1363->105|1403->125|1528->225|1565->247|1604->249|1640->258|1681->272|1696->278|1753->314|1783->317|1798->323|1832->336|1861->337|1891->340|1906->346|1933->351|1980->368|2012->373
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|37->5|37->5|37->5|41->9|41->9|41->9|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|42->10|43->11|44->12
                  -- GENERATED --
              */
          