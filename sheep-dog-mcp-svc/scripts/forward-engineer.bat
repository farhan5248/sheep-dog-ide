cd ..
call mvn clean org.farhan:sheep-dog-svc-maven-plugin:uml-to-cucumber-spring -Dtags="mcp-svc" -Dhost="qa.sheepdog.io"
cd scripts 