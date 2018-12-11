
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

object comments extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.CourseDB.CommentInfo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(comments: List[models.CourseDB.CommentInfo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.47*/("""

"""),_display_(/*3.2*/main("All Filtered Comments")/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/(""" """)))}/*3.35*/ {_display_(Seq[Any](format.raw/*3.37*/("""
  """),format.raw/*4.3*/("""<p>
     """),_display_(/*5.7*/for(comment <- comments) yield /*5.31*/ {_display_(Seq[Any](format.raw/*5.33*/("""
        """),format.raw/*6.9*/("""Professor Name: """),_display_(/*6.26*/comment/*6.33*/.profName),format.raw/*6.42*/("""</br>
        Second Professor Name: """),_display_(/*7.33*/comment/*7.40*/.secProfName),format.raw/*7.52*/("""</br>
        Semester: """),_display_(/*8.20*/comment/*8.27*/.semester),format.raw/*8.36*/("""</br>
        Course Name: """),_display_(/*9.23*/comment/*9.30*/.courseName),format.raw/*9.41*/("""</br>
        Comment Content: """),_display_(/*10.27*/comment/*10.34*/.comment),format.raw/*10.42*/("""</br>
        </br>
     """)))}),format.raw/*12.7*/("""
  """),format.raw/*13.3*/("""</p>
""")))}))
      }
    }
  }

  def render(comments:List[models.CourseDB.CommentInfo]): play.twirl.api.HtmlFormat.Appendable = apply(comments)

  def f:((List[models.CourseDB.CommentInfo]) => play.twirl.api.HtmlFormat.Appendable) = (comments) => apply(comments)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 09 21:13:51 EST 2018
                  SOURCE: /vagrant/316Proj/Milestone2/play-courses/app/views/comments.scala.html
                  HASH: a4203dbbac774531bfcbe6d9594747bced34e726
                  MATRIX: 978->1|1118->46|1146->49|1183->78|1222->80|1242->82|1281->84|1310->87|1345->97|1384->121|1423->123|1458->132|1501->149|1516->156|1545->165|1609->203|1624->210|1656->222|1707->247|1722->254|1751->263|1805->291|1820->298|1851->309|1910->341|1926->348|1955->356|2011->382|2041->385
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|42->10|42->10|42->10|44->12|45->13
                  -- GENERATED --
              */
          