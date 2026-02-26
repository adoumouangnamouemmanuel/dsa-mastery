#!/bin/bash

# ── Usage ─────────────────────────────────────────────────
# bash run.sh TwoSum.java
# bash run.sh 0001_TwoSum.java   (also supported)
# ─────────────────────────────────────────────────────────

if [ -z "$1" ]; then
    echo "Usage: bash run.sh <filename>.java"
    echo "Example: bash run.sh TwoSum.java"
    exit 1
fi

FILE="$1"

if [ ! -f "$FILE" ]; then
    echo "Error: '$FILE' not found."
    exit 1
fi

# Extract the actual class name from inside the file — reliable regardless of filename
CLASS_NAME=$(grep -oP '(?<=\bclass\s)\w+' "$FILE" | head -1)

if [ -z "$CLASS_NAME" ]; then
    echo "Error: Could not detect class name in '$FILE'."
    exit 1
fi

# Extract package name (if any) to build the fully-qualified class name
PACKAGE=$(grep -oP '(?<=^package\s)[\w.]+(?=\s*;)' "$FILE" | head -1)
if [ -n "$PACKAGE" ]; then
    QUALIFIED_NAME="$PACKAGE.$CLASS_NAME"
else
    QUALIFIED_NAME="$CLASS_NAME"
fi

OUT_DIR="out"
mkdir -p "$OUT_DIR"

echo "Compiling $FILE..."
if javac -d "$OUT_DIR" "$FILE"; then
    echo "Running $CLASS_NAME..."
    echo "─────────────────────────────"
    java -cp "$OUT_DIR" "$QUALIFIED_NAME"
else
    echo "Compilation failed. Fix errors above."
    exit 1
fi
