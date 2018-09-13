package junit.org.rapidpm.vaadin.v10.tb.demo;

import static java.lang.Integer.valueOf;
import static org.rapidpm.vaadin.v10.tb.demo.VaadinApp.BTN_CLICK_ME;
import static org.rapidpm.vaadin.v10.tb.demo.VaadinApp.LB_CLICK_COUNT;

import org.openqa.selenium.WebDriver;
import org.rapidpm.vaadin.addons.testbench.junit5.extensions.container.ContainerInfo;
import org.rapidpm.vaadin.addons.testbench.junit5.pageobject.AbstractVaadinPageObject;

import com.vaadin.flow.component.button.testbench.ButtonElement;
import com.vaadin.flow.component.html.testbench.SpanElement;

public class VaadinAppPageObject extends AbstractVaadinPageObject {

	public VaadinAppPageObject(WebDriver webdriver, ContainerInfo containerInfo) {
		super(webdriver, containerInfo);
	}

	public ButtonElement btnClickMe() {
		return btn().id(BTN_CLICK_ME);
	}

	public SpanElement lbClickCount() {
		return span().id(LB_CLICK_COUNT);
	}

	public void click() {
		btnClickMe().click();
	}

	public String clickCountAsString() {
		return lbClickCount().getText();
	}

	// no exception handling
	public int clickCount() {
		return valueOf(clickCountAsString());
	}

}
