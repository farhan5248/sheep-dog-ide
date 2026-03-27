cd ..
call npm install
if not exist build mkdir build
call npx vsce package --out build/sheep-dog-vscode-plugin.vsix
call code --install-extension build/sheep-dog-vscode-plugin.vsix
cd scripts
