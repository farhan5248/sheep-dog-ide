cd ..
call mvn clean org.farhan:sheep-dog-dev-svc-maven-plugin:uml-to-cucumber-spring -Dtags="round-trip" -Dhost="dev.sheepdog.io"
cd scripts 