# function-frontend-qa
Automation test project for function frontend service

---

## How to Run
1. Ensure chromedriver is available on system environment by running `chromedriver` command
2. Specify which tag will be run at `DefinitionTestSuite`
3. Do not forget to revert to default tag `@Regression` before committing work(s)

---

## Testing Notes:
- Use `@Regression` for features which will be tested without specifying specific tags
- Use `@Positive` for features which are tested in positive condition (happy flow)
- Use `@Negative` for features which are tested in negative condition
- Add custom annotation for features to ease testing separate feature (e.g.: Sanity test uses `@Sanity`)
