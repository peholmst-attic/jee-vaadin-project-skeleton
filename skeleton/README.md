Skeleton Readme
===

This is a project stub for a Vaadin and Java EE 7 Web Profile application.

## Compiling the widgetset

In the `skeleton-widgetset` module, activate the `widgetset` Maven profile:

`$ mvn clean package -Pwidgetset`

The compiled files will be saved in `src/main/resources/VAADIN` to avoid having to 
recompile the widgetset after every clean. When the `widgetset` profile is active,
the clean operation will remove the compiled files as well.

## Running the application

In the `skeleton-ui` module, use the Wildfly plugin:

`$ mvn wildfly:run`

## Packaging for production

In the `skeleton-production` module, activate the `production` Maven profile:

`$ mvn clean package -Pproduction`
