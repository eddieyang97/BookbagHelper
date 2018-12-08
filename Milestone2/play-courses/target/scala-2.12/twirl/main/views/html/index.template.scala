
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Search for professor: ")/*1.32*/ {_display_(Seq[Any](format.raw/*1.34*/(""" """)))}/*1.36*/ {_display_(Seq[Any](format.raw/*1.38*/("""
"""),format.raw/*2.1*/("""<form method="post" action=""""),_display_(/*2.30*/routes/*2.36*/.Application.searchProfessor()),format.raw/*2.66*/("""">
"""),_display_(/*3.2*/helper/*3.8*/.CSRF.formField),format.raw/*3.23*/("""
"""),format.raw/*4.1*/("""Name: <input type="text" name="professor" value=" "
                    size="30" maxlength="30"/><br/>
<input type="submit" value="Submit"/>
</form>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 08 16:45:16 EST 2018
                  SOURCE: /vagrant/316Proj/Milestone2/play-courses/app/views/index.scala.html
                  HASH: d229e5e075be64f130b0aeb094105478d61c3f92
                  MATRIX: 1030->1|1068->31|1107->33|1127->35|1166->37|1193->38|1248->67|1262->73|1312->103|1341->107|1354->113|1389->128|1416->129
                  LINES: 33->1|33->1|33->1|33->1|33->1|34->2|34->2|34->2|34->2|35->3|35->3|35->3|36->4
                  -- GENERATED --
              */
          