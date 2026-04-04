#!/bin/bash
cd "$(dirname "$0")/.."
gradle clean installExtension --refresh-dependencies
