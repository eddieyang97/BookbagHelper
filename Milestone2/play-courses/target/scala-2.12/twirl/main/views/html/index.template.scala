
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(professors: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""

"""),_display_(/*3.2*/main("All Professors")/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/(""" """)))}/*3.28*/ {_display_(Seq[Any](format.raw/*3.30*/("""
  """),format.raw/*4.3*/("""<p>Click on professor below to view more information:
    <ul>
      """),_display_(/*6.8*/for(name <- professors) yield /*6.31*/ {_display_(Seq[Any](format.raw/*6.33*/("""
        """),format.raw/*7.9*/("""<li><a href=""""),_display_(/*7.23*/routes/*7.29*/.Application.viewProfessor(name)),format.raw/*7.61*/("""">"""),_display_(/*7.64*/name),format.raw/*7.68*/("""</a></li>
      """)))}),format.raw/*8.8*/("""
    """),format.raw/*9.5*/("""</ul>
  </p>
""")))}))
      }
    }
  }

  def render(professors:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(professors)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (professors) => apply(professors)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Nov 29 21:36:26 EST 2018
                  SOURCE: /vagrant/316Proj/Milestone2/play-courses/app/views/index.scala.html
                  HASH: 15855a0bc07453f7b524074291cb440e16569153
                  MATRIX: 954->1|1075->27|1103->30|1133->52|1172->54|1192->56|1231->58|1260->61|1355->131|1393->154|1432->156|1467->165|1507->179|1521->185|1573->217|1602->220|1626->224|1672->241|1703->246
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|38->6|38->6|38->6|39->7|39->7|39->7|39->7|39->7|39->7|40->8|41->9
                  -- GENERATED --
              */
          