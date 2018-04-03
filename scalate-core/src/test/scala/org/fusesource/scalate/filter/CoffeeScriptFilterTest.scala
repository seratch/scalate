package org.fusesource.scalate.filter

import org.fusesource.scalate.TemplateTestSupport

class CoffeeScriptFilterTest extends TemplateTestSupport {
  test("coffeescript filter") {
    assertUriOutputContains("/org/fusesource/scalate/scaml/coffee.scaml", """<script type='text/javascript'>
  //<![CDATA[
    alert("Hello, Coffee!");

  //]]>
</script>
""")
  }

}
