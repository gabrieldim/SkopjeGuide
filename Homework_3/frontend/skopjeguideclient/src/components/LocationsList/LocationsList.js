import React, {Component} from 'react';

class LocationsList extends Component {
    constructor(props) {
        super(props);

    }

    async componentDidMount() {
        const data = await fetch('https://skopje-guide.herokuapp.com/api/restaurants');
        const json = await data.json();

        let list = document.getElementById("locationsList");

        for(let i=0; i<json.length; i++) {
            list.innerHTML += `<li>${json[i].lon} ${json[i].lat}  ${json[i].name} ${json[i].website}  ${json[i].phone}</li>`;
        }
    }

    render() {
        return (
            <div>
            <h1>Locations list</h1>
        <ul id="locationsList">

            </ul>
            </div>
    );
    }
}


export default LocationsList;