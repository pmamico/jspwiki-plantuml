#!/bin/bash

cd $(git rev-parse --show-toplevel)
fswatch -or ./src | xargs -n1 -I{} ./dev/build.sh
