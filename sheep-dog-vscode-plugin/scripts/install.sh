#!/bin/bash
cd "$(dirname "$0")/.."
mvn clean install > log.txt 2>&1
code --uninstall-extension sheep-dog-tools.xtext-asciidoc-plugin
for f in target/*.vsix; do code --install-extension "$f"; done
