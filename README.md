# Sheep Dog IDE

IDE plugins providing AsciiDoc language support with syntax highlighting and LSP.

## Projects

| Project | Description |
|---------|-------------|
| sheep-dog-vscode-plugin | VS Code extension (Gradle build, pulls LSP server from Maven) |
| sheepdogeclipseplugin.parent | Eclipse LSP4E plugin |

## Build Commands

### VS Code

```
gradle clean installExtension
```

Run from the `sheep-dog-vscode-plugin` directory.

### Eclipse

```
mvn clean install
```

Run from the `sheepdogeclipseplugin.parent` directory.
