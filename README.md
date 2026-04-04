# Sheep Dog IDE

IDE plugins that provide real-time AsciiDoc language support. The LSP server from sheep-dog-core (sheepdogasciidoc.parent) powers both plugins, providing syntax highlighting, content assist, validation, and quick fixes as specifications are edited.

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
