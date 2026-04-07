# Sheep Dog Eclipse Plugin

Eclipse IDE plugin providing AsciiDoc language server integration for Sheep Dog specifications.

## Overview

Eclipse RCP plugin that runs the Xtext AsciiDoc language server in-process via LSP4E. Provides syntax highlighting, validation, and code generation for AsciiDoc specification files. Built with Tycho for multi-platform support (Windows, macOS, Linux).

## Modules

| Module | Description |
|--------|-------------|
| sheepdogeclipseplugin | Core plugin with LSP connection provider and command handlers |
| sheepdogeclipseplugin.feature | Eclipse feature for packaging |
| sheepdogeclipseplugin.repository | P2 update site repository |
| sheepdogeclipseplugin.target | Target platform definition |

## Key Functionality

- In-process Xtext language server via LSP4E
- Syntax highlighting via TextMate grammar
- Code generation command (Ctrl+Alt+Shift+G)
- Content type registration for AsciiDoc files

## Technology

- Eclipse Tycho 5.0
- LSP4E (Language Server Protocol for Eclipse)
- Depends on sheepdogasciidoc.parent, sheep-dog-grammar
- Java 21

## Build

```
mvn clean install
```
