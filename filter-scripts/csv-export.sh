#!/bin/bash

osmfilter filtered-datasets/restaurants.osm | osmconvert - --all-to-nodes --csv="@id @lon @lat name" --csv-headline --csv-separator="," -o=filtered-datasets-csv/restaurants.csv
osmfilter filtered-datasets/caffe.osm | osmconvert - --all-to-nodes --csv="@id @lon @lat name" --csv-headline --csv-separator="," -o=filtered-datasets-csv/caffe.csv
osmfilter filtered-datasets/pub.osm | osmconvert - --all-to-nodes --csv="@id @lon @lat name" --csv-headline --csv-separator="," -o=filtered-datasets-csv/pub.csv
osmfilter filtered-datasets/parking.osm | osmconvert - --all-to-nodes --csv="@id @lon @lat name" --csv-headline --csv-separator="," -o=filtered-datasets-csv/parking.csv
osmfilter filtered-datasets/exchange_office.osm | osmconvert - --all-to-nodes --csv="@id @lon @lat name" --csv-headline --csv-separator="," -o=filtered-datasets-csv/exchange_office.csv
osmfilter filtered-datasets/hospital.osm | osmconvert - --all-to-nodes --csv="@id @lon @lat name" --csv-headline --csv-separator="," -o=filtered-datasets-csv/hospital.csv
osmfilter filtered-datasets/fountains.osm | osmconvert - --all-to-nodes --csv="@id @lon @lat name" --csv-headline --csv-separator="," -o=filtered-datasets-csv/fountains.csv
osmfilter filtered-datasets/attraction.osm | osmconvert - --all-to-nodes --csv="@id @lon @lat name" --csv-headline --csv-separator="," -o=filtered-datasets-csv/attraction.csv
osmfilter filtered-datasets/hostel.osm | osmconvert - --all-to-nodes --csv="@id @lon @lat name" --csv-headline --csv-separator="," -o=filtered-datasets-csv/hostel.csv
osmfilter filtered-datasets/hotel.osm | osmconvert - --all-to-nodes --csv="@id @lon @lat name" --csv-headline --csv-separator="," -o=filtered-datasets-csv/hotel.csv
osmfilter filtered-datasets/motel.osm | osmconvert - --all-to-nodes --csv="@id @lon @lat name" --csv-headline --csv-separator="," -o=filtered-datasets-csv/motel.csv
