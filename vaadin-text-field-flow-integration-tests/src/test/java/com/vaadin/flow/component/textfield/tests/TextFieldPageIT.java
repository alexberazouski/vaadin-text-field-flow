/*
 * Copyright 2000-2017 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.flow.component.textfield.tests;

import com.vaadin.flow.component.textfield.testbench.TextFieldElement;
import com.vaadin.testbench.TestBenchTestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.testutil.AbstractComponentIT;
import com.vaadin.flow.testutil.TestPath;

/**
 * Integration tests for {@link TextField}.
 */
@TestPath("text-field-test")
public class TextFieldPageIT extends TestBenchTestCase {

    @Before
    public void init() {
        setDriver(new FirefoxDriver());
        getDriver().get("http://localhost:9998/text-field-test");
    }

    @Test
    public void checkSendKeys() {
        TextFieldElement tf = $(TextFieldElement.class).first();

        //Works in FF and Edge
        tf.$("input").attribute("slot", "input").first()
                .sendKeys(Keys.ENTER);

        // Doesn't work
        tf.sendKeys(Keys.ENTER);
    }


}
