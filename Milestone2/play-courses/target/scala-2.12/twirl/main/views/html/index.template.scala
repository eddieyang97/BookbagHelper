
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


Seq[Any](format.raw/*1.1*/("""<head>
  <title>Bookbag Helper</title>
	<link rel="stylesheet" type="text/css" href=""""),_display_(/*3.48*/routes/*3.54*/.Assets.at("stylesheets/style.css")),format.raw/*3.89*/("""">
</head>
<body style='background: url("bg.jpg")'>
  <div id="u1" class="title">
      <img src=""""),_display_(/*7.18*/routes/*7.24*/.Assets.at("images/icon1.png")),format.raw/*7.54*/("""" alt="" class = "icon">
      <h1>Bookbag Helper</h1>
  </div>
  <div class = "searches">
    <div class = "search_bar">
      """),_display_(/*12.8*/main("Search for professor: ")/*12.38*/ {_display_(Seq[Any](format.raw/*12.40*/(""" """)))}/*12.42*/ {_display_(Seq[Any](format.raw/*12.44*/("""
      """),format.raw/*13.7*/("""<form method="post" action=""""),_display_(/*13.36*/routes/*13.42*/.Application.searchProfessor()),format.raw/*13.72*/("""">
      """),_display_(/*14.8*/helper/*14.14*/.CSRF.formField),format.raw/*14.29*/("""
      """),format.raw/*15.7*/("""Name: <input type="text" name="professor" value="" size="30" maxlength="30"/>
      <input type="submit" value="Submit"/>
      </form>
      """)))}),format.raw/*18.8*/("""
      """),format.raw/*19.7*/("""<a href=""""),_display_(/*19.17*/routes/*19.23*/.Application.searchAllProfessor()),format.raw/*19.56*/("""">View All Professors</a>
    </div>
    <div class = "search_bar">
      """),_display_(/*22.8*/main("Search for course: ")/*22.35*/ {_display_(Seq[Any](format.raw/*22.37*/(""" """)))}/*22.39*/ {_display_(Seq[Any](format.raw/*22.41*/("""
      """),format.raw/*23.7*/("""<form method="post" action=""""),_display_(/*23.36*/routes/*23.42*/.Application.searchCourse()),format.raw/*23.69*/("""">
      """),_display_(/*24.8*/helper/*24.14*/.CSRF.formField),format.raw/*24.29*/("""
      """),format.raw/*25.7*/("""Name: <input type="text" name="course" value="" size="30" maxlength="30"/>
      <input type="submit" value="Submit"/>
      </form>
      """)))}),format.raw/*28.8*/("""
      """),format.raw/*29.7*/("""<a href=""""),_display_(/*29.17*/routes/*29.23*/.Application.searchAllCourse()),format.raw/*29.53*/("""">View All Courses</a>
    </div>
  </div>
</body>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 10 21:48:50 EST 2018
                  SOURCE: /vagrant/316Proj/Milestone2/play-courses/app/views/index.scala.html
                  HASH: 52c101f7a42e3b3b840b6d7339a73333b73071f0
                  MATRIX: 1030->0|1142->86|1156->92|1211->127|1336->226|1350->232|1400->262|1555->391|1594->421|1634->423|1655->425|1695->427|1729->434|1785->463|1800->469|1851->499|1887->509|1902->515|1938->530|1972->537|2145->680|2179->687|2216->697|2231->703|2285->736|2386->811|2422->838|2462->840|2483->842|2523->844|2557->851|2613->880|2628->886|2676->913|2712->923|2727->929|2763->944|2797->951|2967->1091|3001->1098|3038->1108|3053->1114|3104->1144
                  LINES: 33->1|35->3|35->3|35->3|39->7|39->7|39->7|44->12|44->12|44->12|44->12|44->12|45->13|45->13|45->13|45->13|46->14|46->14|46->14|47->15|50->18|51->19|51->19|51->19|51->19|54->22|54->22|54->22|54->22|54->22|55->23|55->23|55->23|55->23|56->24|56->24|56->24|57->25|60->28|61->29|61->29|61->29|61->29
                  -- GENERATED --
              */
          