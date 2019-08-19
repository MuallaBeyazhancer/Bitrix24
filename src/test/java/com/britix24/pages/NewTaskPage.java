package com.britix24.pages;

import com.britix24.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewTaskPage {
    public NewTaskPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "input[name='ACTION[0][ARGUMENTS][data][TITLE]']")
    public WebElement thingsToDo;

    @FindBy(css= "body[contenteditable='true']")
    public WebElement bodyToExplain;

    @FindBy(css = "button[class='ui-btn ui-btn-success']")
    public WebElement addTaskEnterButton;

    @FindBy(css = "span[id^='bx-b-uploadfile-task-form-bitrix']")
    public WebElement uploadFilesImage;
}
