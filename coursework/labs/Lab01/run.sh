#!/bin/bash

# ── Config ────────────────────────────────────────────────
MAIN_CLASS="LibrarySystem"
OUT_DIR="out"
# ─────────────────────────────────────────────────────────

# Create output directory if it doesn't exist
mkdir -p "$OUT_DIR"

echo "Compiling..."
if javac -d "$OUT_DIR" *.java; then
    echo "Running $MAIN_CLASS..."
    echo "─────────────────────────────"
    java -cp "$OUT_DIR" "$MAIN_CLASS"
else
    echo "Compilation failed. Fix errors above."
    exit 1
fi
