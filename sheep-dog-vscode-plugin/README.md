# Sheep Dog VS Code Plugin

VS Code extension providing AsciiDoc language server integration for Sheep Dog specifications.

## Overview

Gradle-based VS Code extension that embeds the Xtext AsciiDoc language server from sheepdogasciidoc.parent. Provides syntax highlighting, validation, code completion, go to definition, formatting, and code generation for AsciiDoc specification files.

## Key Functionality

- Syntax highlighting via TextMate grammar
- Real-time validation with error markers
- Code completion and content assist
- Go to definition and find references
- Document formatting
- Document outline and symbol navigation
- Code generation command

## Technology

- Gradle build
- TypeScript (VS Code extension)
- vscode-languageclient
- Embeds Xtext LSP server JAR from sheepdogasciidoc.parent
- Node.js 20

## Build

```
scripts/install.bat
```

This runs `gradle clean installExtension --refresh-dependencies`.
