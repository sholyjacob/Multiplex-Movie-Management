
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
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<html lang="en">
<head>
  <meta charset="UTF-8">
  <h4><a href=""""),_display_(/*4.17*/routes/*4.23*/.MovieController.listAll()),format.raw/*4.49*/(""""> Movie</a><a href=""""),_display_(/*4.71*/routes/*4.77*/.SocketController.index()),format.raw/*4.102*/(""""> Movie Search</a></h4>
  <tr></tr>
  <h4><a href=""""),_display_(/*6.17*/routes/*6.23*/.MultiplexController.listAll()),format.raw/*6.53*/(""""> Multiplex</a><a href=""""),_display_(/*6.79*/routes/*6.85*/.SocketControllerMultiplex.index()),format.raw/*6.119*/(""""> Multiplex Search</a></h4>
</head>
<body>

</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-15T10:47:22.185
                  SOURCE: D:/PlaySamples/multiplex-movie-management/app/views/index.scala.html
                  HASH: 835a73ce8af7cb1da37e280f33efb40e71630866
                  MATRIX: 990->0|1084->68|1098->74|1144->100|1192->122|1206->128|1252->153|1333->208|1347->214|1397->244|1449->270|1463->276|1518->310
                  LINES: 32->1|35->4|35->4|35->4|35->4|35->4|35->4|37->6|37->6|37->6|37->6|37->6|37->6
                  -- GENERATED --
              */
          