#!/bin/sh

osmfilter datasets/Skopje-Dataset.osm --keep="amenity=restaurant" --drop="access=no" --ignore-dependencies -o=filtered-datasets/restaurants.osm
osmfilter datasets/Skopje-Dataset.osm --keep="amenity=caffe" --drop="access=no" --ignore-dependencies -o=filtered-datasets/caffe.osm
osmfilter datasets/Skopje-Dataset.osm --keep="amenity=pub" --drop="access=no" --ignore-dependencies -o=filtered-datasets/pub.osm
osmfilter datasets/Skopje-Dataset.osm --keep="amenity=parking" --drop="access=no" --ignore-dependencies -o=filtered-datasets/parking.osm
osmfilter datasets/Skopje-Dataset.osm --keep="amenity=bureau_de_change" --drop="access=no" --ignore-dependencies -o=filtered-datasets/exchange_office.osm
osmfilter datasets/Skopje-Dataset.osm --keep="amenity=hospital" --drop="access=no" --ignore-dependencies -o=filtered-datasets/hospital.osm
osmfilter datasets/Skopje-Dataset.osm --keep="amenity=fountain" --drop="access=no" --ignore-dependencies -o=filtered-datasets/fountains.osm
osmfilter datasets/Skopje-Dataset.osm --keep="tourism=attraction" --drop="access=no" --ignore-dependencies -o=filtered-datasets/attraction.osm
osmfilter datasets/Skopje-Dataset.osm --keep="tourism=hostel" --drop="access=no" --ignore-dependencies -o=filtered-datasets/hostel.osm
osmfilter datasets/Skopje-Dataset.osm --keep="tourism=hotel" --drop="access=no" --ignore-dependencies -o=filtered-datasets/hotel.osm
osmfilter datasets/Skopje-Dataset.osm --keep="tourism=motel" --drop="access=no" --ignore-dependencies -o=filtered-datasets/motel.osm




