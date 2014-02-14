package org.scalaide.worksheet.properties

import org.scalaide.ui.syntax.ScalaSyntaxClass

class SyntaxColouringPreviewText {

  val previewText = """some code   //> Hello
some code   //| World
"""

  case class ColouringLocation(syntaxClass: ScalaSyntaxClass, offset: Int, length: Int)

}