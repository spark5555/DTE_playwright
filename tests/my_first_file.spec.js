const {test, expect} = require('@playwright/test')

test('My first test', async ({page}) => {

    await page.goto('https://google.com')
    //expect(await page.title()).toBe('Google')
    await expect(page).toHaveTitle('Google')
})