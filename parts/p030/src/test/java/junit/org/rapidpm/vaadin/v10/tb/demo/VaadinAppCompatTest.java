package junit.org.rapidpm.vaadin.v10.tb.demo;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestTemplate;
import org.rapidpm.vaadin.addons.testbench.junit5.extensions.compattest.VaadinWebCompatTest;

@VaadinWebCompatTest
public class VaadinAppCompatTest {

  @TestTemplate
  @DisplayName("Hello World - Click twice")
   @Disabled("classloader challenges with Atmosphere")
  void test001(VaadinAppPageObject pageObject) {
    pageObject.loadPage();
    assertEquals(0, pageObject.clickCount());
    pageObject.click();
    assertEquals(1, pageObject.clickCount());
  }
}
