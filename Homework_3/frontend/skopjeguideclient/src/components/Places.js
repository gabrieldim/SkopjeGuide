import React from 'react'

import Header from "./Header";
import Footer from "./Footer";

export default function Places() {
    return (
        <>
            <Header></Header>
            <div id='blokovi' style={{margin: "50px"}}>
                <div className="row">
                    <div className="col-md-2">
                        <h2>Categories</h2>
                        <ul id="kategorii">
                            <li><label htmlFor="Restaurants">Restaurants</label><input id="Restaurants" type="checkbox"></input>
                            </li>
                            <li><label htmlFor="Pubs">Pubs</label><input id="Pubs" type="checkbox"></input></li>
                            <li><label htmlFor="Caffes">Caffes</label><input id="Caffes" type="checkbox"></input></li>
                            <li><label htmlFor="Hotels">Hotels</label><input id="Hotels" type="checkbox"></input></li>
                            <li><label htmlFor="Hostels">Hostels</label><input id="Hostels" type="checkbox"></input></li>
                            <li><label htmlFor="Hospitals">Hospitals</label><input id="Hospitals" type="checkbox"></input></li>

                            <li><label htmlFor="Parking">Parking</label><input id="Parking" type="checkbox"></input></li>
                            <li><label htmlFor="Exchange offices">Exchange offices</label><input id="Exchange offices"
                                                                                                 type="checkbox"></input></li>
                            <li><label htmlFor="Tourist attractions">Tourist attractions</label><input
                                id="Tourist attractions" type="checkbox"></input></li>
                            <li><label htmlFor="Fountains">Fountains</label><input id="Fountains" type="checkbox"></input></li>
                        </ul>
                    </div>
                    <div id="result_list">
                        <p>Results based on the selected category will be shown here</p>
                    </div>

                </div>
            </div>

            <Footer></Footer>

        </>
    )
}
