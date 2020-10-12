
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
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="apple-touch-icon" sizes="76x76" href="public/image/apple-icon.png">
    <link rel="icon" type="image/png" href="public/image/favicon.png">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>SyncAppTest</title>
    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
    <!--     Fonts and icons     -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.1/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
    <!-- CSS Files -->
    <link href="public/stylesheets/bootstrap.min.css" rel="stylesheet" />
    <link href="public/stylesheets/ui-dash.css?v=1.5.0" rel="stylesheet" />
</head>
<body class="">
<div class="wrapper ">
    <div class="sidebar" data-color="red">
        <!--
          Tip 1: You can change the color of the sidebar using: data-color="blue | green | orange | red | yellow"
      -->
        <div class="logo">
            <text class="simple-text logo-mini">
                SyncAppTest
                <text class="simple-text logo-normal">
                    Jason
        </div>
        <div class="sidebar-wrapper" id="sidebar-wrapper">
            <ul class="nav">
                <li class="active " style="font-weight: bold;">
                    <a href="./index.scala.html">
                        <i class="now-ui-icons design_app"></i>
                        <p>MailChimp Retriever</p>
                    </a>
                </li>
                <li>
                    <a href="./display.scala.html">
                        <i class="now-ui-icons education_atom"></i>
                        <p>Contacts</p>
                    </a>
                </li>
            </ul>
        </div>
    </div>
    """),_display_(/*54.6*/content),format.raw/*54.13*/("""
"""),format.raw/*55.1*/("""</div>
    <!--   Core JS Files   -->
    <script src="public/javascripts/core/jquery.min.js"></script>
    <script src="public/javascripts/popper.min.js"></script>
    <script src="public/javascripts/bootstrap.min.js"></script>
    <script src="public/javascripts/perfect-scrollbar.jquery.min.js"></script>
</body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-10-12T23:33:20.053254
                  SOURCE: D:/VSCode/SyncAppsTest/app/views/main.scala.html
                  HASH: 11cd18158655b112906524b1a04616133bc391c3
                  MATRIX: 1165->260|1289->291|1316->292|3369->2319|3397->2326|3425->2327
                  LINES: 32->7|37->8|38->9|83->54|83->54|84->55
                  -- GENERATED --
              */
          