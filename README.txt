# BJSS_tech_test
technical tests for BJSS

# this framework was written using Maven and assumes you have the latest version Maven installed.
# for the sake of simplicity, Chromedriver is used.

# to run from scratch for the first time, navigate to the cloned directory and use:

mvn install

- this will install all dependencies and run the tests.

# to run all features without installing dependencies, use:

mvn test

# to run a specific feature based on its tag:

mvn test -Dcucumber.options="--tags @tag name>"

# the three tagged features available are:
@RESTCreateUser

@challengingDom

@dynamicallyLoadedElement