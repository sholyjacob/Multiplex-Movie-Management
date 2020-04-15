
package views.html.movies

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
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import views.html.movies.common

object createmovie extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[MovieModel],Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(movieForm : Form[MovieModel])(implicit request: Http.Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.94*/("""
"""),format.raw/*4.1*/("""
    """),_display_(/*5.6*/common("Add Movie")/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
        """),format.raw/*6.9*/("""<h4><a href=""""),_display_(/*6.23*/routes/*6.29*/.HomeController.index()),format.raw/*6.52*/("""">Home</a></h4>
        """),_display_(/*7.10*/helper/*7.16*/.form(action = routes.MovieController.save())/*7.61*/ {_display_(Seq[Any](format.raw/*7.63*/("""
            """),format.raw/*8.13*/("""<!--
            <form action="routes.ProductController.save()" method="POST">
            <label>Enter Product Id</label>
            <input type="number" name="id">
            -->
            <fieldset>
                <legend>Movie</legend>
                """),format.raw/*15.41*/("""
                """),_display_(/*16.18*/helper/*16.24*/.CSRF.formField),format.raw/*16.39*/("""
                """),format.raw/*19.19*/("""
                """),_display_(/*20.18*/helper/*20.24*/.inputText(movieForm("name"), Symbol("_label") -> "Enter Movie Name", Symbol("placeholder") -> "Enter Movie name")),format.raw/*20.138*/("""
                """),_display_(/*21.18*/helper/*21.24*/.inputText(movieForm("category"), Symbol("_label") -> "Enter Movie Category",Symbol("placeholder") -> "Enter movie category")),format.raw/*21.149*/("""
                """),_display_(/*22.18*/helper/*22.24*/.inputText(movieForm("director"), Symbol("_label") -> "Enter Director Name",Symbol("placeholder") -> "Enter director name")),format.raw/*22.147*/("""
                """),_display_(/*23.18*/helper/*23.24*/.inputText(movieForm("producer"), Symbol("_label") -> "Enter Producer Name",Symbol("placeholder") -> "Enter producer name")),format.raw/*23.147*/("""
                """),_display_(/*24.18*/helper/*24.24*/.inputDate(movieForm("releaseDate"), Symbol("_label") -> "Enter release date",Symbol("placeholder") -> "Enter release name")),format.raw/*24.148*/("""
                """),format.raw/*25.17*/("""<input type="submit" value="SAVE" />
            </fieldset>
        """)))}),format.raw/*27.10*/("""
    """)))}),format.raw/*28.6*/("""
"""))
      }
    }
  }

  def render(movieForm:Form[MovieModel],request:Http.Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(movieForm)(request,messages)

  def f:((Form[MovieModel]) => (Http.Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (movieForm) => (request,messages) => apply(movieForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-13T10:52:37.396
                  SOURCE: D:/PlaySamples/multiplex-movie-management/app/views/movies/createmovie.scala.html
                  HASH: 4f33a7b2cf0876b35a6f70167f868a3d4b789d04
                  MATRIX: 618->1|1002->35|1167->130|1212->127|1240->147|1272->154|1299->173|1338->175|1374->185|1414->199|1428->205|1471->228|1523->254|1537->260|1590->305|1629->307|1670->321|1966->613|2012->632|2027->638|2063->653|2109->791|2155->810|2170->816|2306->930|2352->949|2367->955|2514->1080|2560->1099|2575->1105|2720->1228|2766->1247|2781->1253|2926->1376|2972->1395|2987->1401|3133->1525|3179->1543|3282->1615|3319->1622
                  LINES: 23->1|28->2|31->3|34->2|35->4|36->5|36->5|36->5|37->6|37->6|37->6|37->6|38->7|38->7|38->7|38->7|39->8|46->15|47->16|47->16|47->16|48->19|49->20|49->20|49->20|50->21|50->21|50->21|51->22|51->22|51->22|52->23|52->23|52->23|53->24|53->24|53->24|54->25|56->27|57->28
                  -- GENERATED --
              */
          