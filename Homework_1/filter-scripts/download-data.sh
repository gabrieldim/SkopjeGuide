#!/bin/bash

downloadUrl="https://overpass-api.de/api/map?bbox=21.2537,41.9053,21.6959,42.0880"

wget $downloadUrl --output-document=./datasets/"Skopje-Dataset_$(date +%F_%T).osm" 
