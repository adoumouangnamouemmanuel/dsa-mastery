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

BASENAME="${FILE%.java}"

# If filename has a NNNN_ prefix (e.g. 0001_TwoSum), strip it
# Otherwise use the full basename as the class name (e.g. TwoSum)
if [[ "$BASENAME" =~ ^[0-9]+_ ]]; then
    CLASS_NAME="${BASENAME##*_}"
else
    CLASS_NAME="$BASENAME"
fi

OUT_DIR="out"
mkdir -p "$OUT_DIR"

echo "Compiling $FILE..."
if javac -d "$OUT_DIR" "$FILE"; then
    echo "Running $CLASS_NAME..."
    echo "─────────────────────────────"
    java -cp "$OUT_DIR" "$CLASS_NAME"
else
    echo "Compilation failed. Fix errors above."
    exit 1
fi
