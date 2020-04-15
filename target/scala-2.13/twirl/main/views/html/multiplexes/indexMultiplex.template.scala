
package views.html.multiplexes

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

object indexMultiplex extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[MultiplexModel],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(multiplexes : List[MultiplexModel]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.38*/("""

"""),_display_(/*5.2*/common("Multiplexes")/*5.23*/ {_display_(Seq[Any](format.raw/*5.25*/("""

    """),format.raw/*7.5*/("""<h4><a href=""""),_display_(/*7.19*/routes/*7.25*/.HomeController.index()),format.raw/*7.48*/("""">Home</a></h4>
    <h4><a href=""""),_display_(/*8.19*/routes/*8.25*/.MultiplexController.createcMultiplex()),format.raw/*8.64*/("""">Add Multiplex</a></h4>

    <div>
    """),_display_(/*11.6*/for(multiplex <- multiplexes) yield /*11.35*/{_display_(Seq[Any](format.raw/*11.36*/("""
        """),format.raw/*12.9*/("""<div>
            <table>
                <th>Multiplex Name:</th>
                <th>"""),_display_(/*15.22*/multiplex/*15.31*/.name),format.raw/*15.36*/("""</th>
                <tr></tr>
                <th>Address:</th>
                <th>"""),_display_(/*18.22*/multiplex/*18.31*/.address),format.raw/*18.39*/("""</th>
                <tr></tr>
                <th>No of Screens:</th>
                <th>"""),_display_(/*21.22*/multiplex/*21.31*/.noOfSccreens),format.raw/*21.44*/("""</th>
                <th><h4><a href=""""),_display_(/*22.35*/routes/*22.41*/.MultiplexController.updateMultiplex(multiplex.getId)),format.raw/*22.94*/("""">Edit Multiplex</a></h4></th>
                <th><h4><a href=""""),_display_(/*23.35*/routes/*23.41*/.MultiplexController.deleteMultiplex(multiplex.getId)),format.raw/*23.94*/("""">Delete  Multiplex</a></h4></th>
            </table>
        </div>
    """)))}),format.raw/*26.6*/("""
    """),format.raw/*27.5*/("""</div>

""")))}))
      }
    }
  }

  def render(multiplexes:List[MultiplexModel]): play.twirl.api.HtmlFormat.Appendable = apply(multiplexes)

  def f:((List[MultiplexModel]) => play.twirl.api.HtmlFormat.Appendable) = (multiplexes) => apply(multiplexes)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-15T11:06:41.874
                  SOURCE: D:/PlaySamples/multiplex-movie-management/app/views/multiplexes/indexMultiplex.scala.html
                  HASH: 936e800e642aa79c82f0ee0583bbad0a5bef1fd9
                  MATRIX: 623->3|982->37|1113->73|1143->78|1172->99|1211->101|1245->109|1285->123|1299->129|1342->152|1403->187|1417->193|1476->232|1546->276|1591->305|1630->306|1667->316|1785->407|1803->416|1829->421|1946->511|1964->520|1993->528|2116->624|2134->633|2168->646|2236->687|2251->693|2325->746|2418->812|2433->818|2507->871|2615->949|2648->955
                  LINES: 23->2|28->3|33->3|35->5|35->5|35->5|37->7|37->7|37->7|37->7|38->8|38->8|38->8|41->11|41->11|41->11|42->12|45->15|45->15|45->15|48->18|48->18|48->18|51->21|51->21|51->21|52->22|52->22|52->22|53->23|53->23|53->23|56->26|57->27
                  -- GENERATED --
              */
          