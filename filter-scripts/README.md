# Filtering Scripts Pipeline



### [filterPipeline.sh](https://github.com/gabrieldim/SkopjeGuide/blob/main/filter-scripts/filterPipeline.sh)

This script extracts the necessary data from the main dataset file of Skopje(located in the folder "datasets") required for the system to work.
It uses the open-source program "osmfilter" to perform the extraction and filtering.
It filters the location nodes based on their "amenity" and "tourism" key-value pairs. Currently, the script filters location nodes of: 
- restaurants
- pubs
- caffes
- hotels
- hostels
- hospitals 
- parking
- exchange offices
- tourist attractions
- fountains

Additional filter parameters can be easily added.

---

### [download-data.sh](https://github.com/gabrieldim/SkopjeGuide/blob/main/filter-scripts/download-data.sh)

This script downloads the latest dataset for the Skopje area and it saves the file in the datasets folder with the current timestamp.
