
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

object error extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Error")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/(""" """)))}/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
  """),format.raw/*4.3*/("""<p>"""),_display_(/*4.7*/message),format.raw/*4.14*/(""".</p>
  <p><a href=""""),_display_(/*5.16*/routes/*5.22*/.Application.index()),format.raw/*5.42*/("""">Back to Main Page</a></p>
""")))}),format.raw/*6.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 10 17:19:05 EST 2018
                  SOURCE: /vagrant/316Proj/Milestone2/play-courses/app/views/error.scala.html
                  HASH: aacc6e07ab7581ddd06d86d65ea636e212a3e418
                  MATRIX: 948->1|1060->18|1088->21|1109->34|1148->36|1168->38|1207->40|1236->43|1265->47|1292->54|1339->75|1353->81|1393->101|1451->130
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|36->4|36->4|37->5|37->5|37->5|38->6
                  -- GENERATED --
              */
          