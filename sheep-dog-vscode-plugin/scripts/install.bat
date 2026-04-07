cd ..
call mvn clean install > log.txt 2>&1
call code.cmd --uninstall-extension sheep-dog-tools.xtext-asciidoc-plugin
for %%f in (target\*.vsix) do call code.cmd --install-extension "%%f"
cd scripts
