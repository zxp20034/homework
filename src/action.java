Actions action = new Actions(driver)
action.keyDown(Key.SHIFT).
	           click(element)
	           click(second_element).
	           keyUp(Keys.SHIFT).
               dragAndDrop(element,third_element).
                           build().
               perform()