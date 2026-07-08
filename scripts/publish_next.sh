#!/usr/bin/env bash
# Publishes exactly ONE solution file from queue/ into solutions/ each time it's run.
# Meant to be run once per day by the GitHub Actions workflow.

set -euo pipefail

QUEUE_DIR="queue"
SOLUTIONS_DIR="solutions"
LOG_FILE="published.log"

mkdir -p "$SOLUTIONS_DIR"
touch "$LOG_FILE"

# Get the next file in alphabetical/numeric order that hasn't been published yet
NEXT_FILE=$(find "$QUEUE_DIR" -maxdepth 1 -type f | sort | head -n 1 || true)

if [ -z "$NEXT_FILE" ]; then
  echo "Queue is empty. Nothing to publish today."
  exit 0
fi

FILENAME=$(basename "$NEXT_FILE")

# Move it into solutions/
mv "$NEXT_FILE" "$SOLUTIONS_DIR/$FILENAME"

# Log it
echo "$(date -u +'%Y-%m-%dT%H:%M:%SZ') - published $FILENAME" >> "$LOG_FILE"

echo "Published: $FILENAME"
echo "Remaining in queue: $(find "$QUEUE_DIR" -maxdepth 1 -type f | wc -l)"
