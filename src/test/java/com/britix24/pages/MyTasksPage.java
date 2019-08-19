package com.britix24.pages;

import com.britix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyTasksPage {
    public MyTasksPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "PageFactory.initElements(Driver.get(), this);")
    public WebElement tasksPlusSign;




}
