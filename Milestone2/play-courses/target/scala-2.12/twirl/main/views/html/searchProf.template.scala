
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

object searchProf extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,List[models.CourseDB.ProfessorInfo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchedName:String, professors: List[models.CourseDB.ProfessorInfo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.72*/("""

"""),_display_(/*3.2*/main("All Matched Professors for " + searchedName)/*3.52*/ {_display_(Seq[Any](format.raw/*3.54*/(""" """)))}/*3.56*/ {_display_(Seq[Any](format.raw/*3.58*/("""
	"""),format.raw/*4.2*/("""<table>
		<tr>
  			<th><a href=""""),_display_(/*6.20*/routes/*6.26*/.Application.searchProfessorSortByName(searchedName)),format.raw/*6.78*/("""">Name</a></th>
  			<th><a href=""""),_display_(/*7.20*/routes/*7.26*/.Application.searchProfessorSortByQuality(searchedName)),format.raw/*7.81*/("""">Quality</a></th>
     		<th><a href=""""),_display_(/*8.22*/routes/*8.28*/.Application.searchProfessorSortByDifficulty(searchedName)),format.raw/*8.86*/("""">Difficulty</a></th>
		</tr>
		"""),_display_(/*10.4*/for(prof <- professors) yield /*10.27*/ {_display_(Seq[Any](format.raw/*10.29*/("""
 		"""),format.raw/*11.4*/("""<tr>
    		<th><a href=""""),_display_(/*12.21*/routes/*12.27*/.Application.viewProfessor(prof.name)),format.raw/*12.64*/("""">"""),_display_(/*12.67*/prof/*12.71*/.name),format.raw/*12.76*/("""</a></th>
    		<th>"""),_display_(/*13.12*/prof/*13.16*/.quality),format.raw/*13.24*/("""</th>
    		<th>"""),_display_(/*14.12*/prof/*14.16*/.difficulty),format.raw/*14.27*/("""</th>
 		</tr>
 		""")))}),format.raw/*16.5*/("""
 	"""),format.raw/*17.3*/("""</table>
""")))}))
      }
    }
  }

  def render(searchedName:String,professors:List[models.CourseDB.ProfessorInfo]): play.twirl.api.HtmlFormat.Appendable = apply(searchedName,professors)

  def f:((String,List[models.CourseDB.ProfessorInfo]) => play.twirl.api.HtmlFormat.Appendable) = (searchedName,professors) => apply(searchedName,professors)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 10 17:19:05 EST 2018
                  SOURCE: /vagrant/316Proj/Milestone2/play-courses/app/views/searchProf.scala.html
                  HASH: 766305c5dc40dc727c612f2c06c5a4b2ade44854
                  MATRIX: 989->1|1154->71|1182->74|1240->124|1279->126|1299->128|1338->130|1366->132|1426->166|1440->172|1512->224|1573->259|1587->265|1662->320|1728->360|1742->366|1820->424|1879->457|1918->480|1958->482|1989->486|2041->511|2056->517|2114->554|2144->557|2157->561|2183->566|2231->587|2244->591|2273->599|2317->616|2330->620|2362->631|2411->650|2441->653
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|42->10|42->10|42->10|43->11|44->12|44->12|44->12|44->12|44->12|44->12|45->13|45->13|45->13|46->14|46->14|46->14|48->16|49->17
                  -- GENERATED --
              */
          