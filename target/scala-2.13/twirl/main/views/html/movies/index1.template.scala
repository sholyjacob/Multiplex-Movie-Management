
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
/*2.2*/import views.html.movies.common

object index1 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[MovieModel],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(movies : List[MovieModel]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.29*/("""

"""),_display_(/*5.2*/common("Movies")/*5.18*/ {_display_(Seq[Any](format.raw/*5.20*/("""

 """),format.raw/*7.2*/("""<!-- <input type="submit" onclick="location.href='"""),_display_(/*7.53*/routes/*7.59*/.MovieController.createMovie()),format.raw/*7.89*/("""" value="Add Movie" />-->
  <!--<button class="delete" href=""""),_display_(/*8.37*/routes/*8.43*/.MovieController.createMovie()),format.raw/*8.73*/("""">Add Movie</button>-->
  <h4><a href=""""),_display_(/*9.17*/routes/*9.23*/.HomeController.index()),format.raw/*9.46*/("""">Home</a></h4>
  <h4><a href=""""),_display_(/*10.17*/routes/*10.23*/.MovieController.createMovie()),format.raw/*10.53*/("""">Add Movie</a></h4>
  <div>
    """),_display_(/*12.6*/for(movie <- movies) yield /*12.26*/{_display_(Seq[Any](format.raw/*12.27*/("""
      """),format.raw/*13.7*/("""<div>
        <table>
      <th>Movie Name:</th>
      <th>"""),_display_(/*16.12*/movie/*16.17*/.name),format.raw/*16.22*/("""</th>
          <tr></tr>
      <th>Director:</th>
        <th>"""),_display_(/*19.14*/movie/*19.19*/.director),format.raw/*19.28*/("""</th>
        <tr></tr>
        <th>Producer:</th>
        <th>"""),_display_(/*22.14*/movie/*22.19*/.producer),format.raw/*22.28*/("""</th>
          <th><h4><a href=""""),_display_(/*23.29*/routes/*23.35*/.MovieController.updateMovie(movie.getId)),format.raw/*23.76*/("""">Edit Movie</a></h4></th>

          <th><h4><a href=""""),_display_(/*25.29*/routes/*25.35*/.MovieController.deleteMovie(movie.getId)),format.raw/*25.76*/("""">Delete  Movie</a></h4></th>
        </table>
        </div>
    """)))}),format.raw/*28.6*/("""
  """),format.raw/*29.3*/("""</div>

""")))}))
      }
    }
  }

  def render(movies:List[MovieModel]): play.twirl.api.HtmlFormat.Appendable = apply(movies)

  def f:((List[MovieModel]) => play.twirl.api.HtmlFormat.Appendable) = (movies) => apply(movies)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-15T11:06:41.815
                  SOURCE: D:/PlaySamples/multiplex-movie-management/app/views/movies/index1.scala.html
                  HASH: 9ad2e2354a978b546c65f339e10f14591f56c7a7
                  MATRIX: 618->3|965->37|1087->64|1117->69|1141->85|1180->87|1211->92|1288->143|1302->149|1352->179|1441->242|1455->248|1505->278|1572->319|1586->325|1629->348|1689->381|1704->387|1755->417|1817->453|1853->473|1892->474|1927->482|2017->545|2031->550|2057->555|2151->622|2165->627|2195->636|2289->703|2303->708|2333->717|2395->752|2410->758|2472->799|2557->857|2572->863|2634->904|2734->974|2765->978
                  LINES: 23->2|28->3|33->3|35->5|35->5|35->5|37->7|37->7|37->7|37->7|38->8|38->8|38->8|39->9|39->9|39->9|40->10|40->10|40->10|42->12|42->12|42->12|43->13|46->16|46->16|46->16|49->19|49->19|49->19|52->22|52->22|52->22|53->23|53->23|53->23|55->25|55->25|55->25|58->28|59->29
                  -- GENERATED --
              */
          