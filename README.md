Demo Crosswalk transparency bug
-------

Demo test case for [XWALK-3308](https://crosswalk-project.org/jira/browse/XWALK-3308).

This app has three flavors:

* `withoutCrosswalk`
* `withCrosswalkArmv7`
* `withCrosswalkX86`

To install the no-Crosswalk (i.e. WebView) version, do:

    ./gradlew installWithoutCrosswalkDebug

To install the Crosswalk version on an Armv7 device, do:

    ./gradlew installWithCrosswalkArmv7Debug