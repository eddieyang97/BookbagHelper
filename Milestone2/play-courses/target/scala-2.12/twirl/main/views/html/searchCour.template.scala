
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

object searchCour extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(courses: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/("""

"""),_display_(/*3.2*/main("All Matched Courses")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/(""" """)))}/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
  """),format.raw/*4.3*/("""<p>Click on course below to view more information:
    <ul>
      """),_display_(/*6.8*/for(name <- courses) yield /*6.28*/ {_display_(Seq[Any](format.raw/*6.30*/("""
        """),format.raw/*7.9*/("""<li><a href=""""),_display_(/*7.23*/routes/*7.29*/.Application.viewCourse(name)),format.raw/*7.58*/("""">"""),_display_(/*7.61*/name),format.raw/*7.65*/("""</a></li>
      """)))}),format.raw/*8.8*/("""
    """),format.raw/*9.5*/("""</ul>
    <a href=""""),_display_(/*10.15*/routes/*10.21*/.Application.index()),format.raw/*10.41*/("""">Back to Main Page</a>
  </p>
""")))}))
      }
    }
  }

  def render(courses:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(courses)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (courses) => apply(courses)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 09 20:14:58 EST 2018
                  SOURCE: /vagrant/316Proj/Milestone2/play-courses/app/views/searchCour.scala.html
                  HASH: 4b7f09e9d15c46393bad200dcf6c3d5011238283
                  MATRIX: 959->1|1077->24|1105->27|1140->54|1179->56|1199->58|1238->60|1267->63|1359->130|1394->150|1433->152|1468->161|1508->175|1522->181|1571->210|1600->213|1624->217|1670->234|1701->239|1748->259|1763->265|1804->285
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|38->6|38->6|38->6|39->7|39->7|39->7|39->7|39->7|39->7|40->8|41->9|42->10|42->10|42->10
                  -- GENERATED --
              */
          