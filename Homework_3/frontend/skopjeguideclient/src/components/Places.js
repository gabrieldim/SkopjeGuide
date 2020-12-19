import React from 'react'

import Header from "./Header";
import Footer from "./Footer";
import LocationsList from "./LocationsList/LocationsList";

const styles = {
    blocks: {
        margin: "50px"
    }
}

export default function Places() {
    return (
      <>
        <Header></Header>
        <div id="blokovi" style={styles.blocks} >
          <div className="row">
            <div className="col-md-2">
              <h2>Categories</h2>
              <ul id="kategorii">
                <li>
                  <input id="restaurants" type="checkbox"></input>{' '}
                  <label htmlFor="restaurants"> Restaurants</label>
                </li>
                <li>
                  <input id="pubs" type="checkbox"></input>{' '}
                  <label htmlFor="pubs">Pubs </label>

                </li>
                <li>
                  <input id="hotels" type="checkbox"></input>{' '}
                  <label htmlFor="hotels">Hotels </label>

                </li>
                <li>
                  <input id="hostels" type="checkbox"></input>{' '}
                  <label htmlFor="hostels">Hostels </label>

                </li>
                <li>
                  <input id="hospitals" type="checkbox"></input>{' '}
                  <label htmlFor="hospitals">Hospitals </label>

                </li>

                <li>
                  <input id="parking" type="checkbox"></input>{' '}
                  <label htmlFor="parking">Parking </label>

                </li>
                <li>
                  <input id="exchangeoffices" type="checkbox"></input>{' '}
                  <label htmlFor="exchangeoffices">Exchange offices </label>

                </li>
                <li>
                  <input id="touristattractions" type="checkbox"></input>{' '}
                  <label htmlFor="touristattractions">
                    Tourist attractions
                  </label>

                </li>
                <li>
                  <input id="fountains" type="checkbox"></input>{' '}
                  <label htmlFor="fountains">Fountains </label>

                </li>
              </ul>
            </div>
            <div id="result_list" style={{paddingLeft:"105px"}}>
              <h1>Locations: </h1>
              <LocationsList></LocationsList>
            </div>
          </div>
        </div>

        <Footer></Footer>
      </>
    );
}
