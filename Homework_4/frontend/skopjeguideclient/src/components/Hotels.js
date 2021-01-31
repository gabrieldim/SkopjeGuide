import React, {Component} from 'react';

import Header from "./Header";
import Footer from "./Footer";
import HotelsList from "./LocationsList/HotelsList";
import RestaurantsList from "./LocationsList/RestaurantsList";
import {Link} from "react-router-dom";

const styles = {
    blocks: {
        margin: "50px"
    }
}


class Hotels extends Component {


    render() {

        return (
            <>
                <Header></Header>
                <div id="blokovi" style={styles.blocks} >
                    <div className="row">
                        <div className="col-md-2">
                            <h2>Categories</h2>
                            <ul>
                                <li>
                                    <li>
                                        <Link style={{fontSize: "150%"}} to={"/hotels"}> Hotels</Link>
                                    </li>

                                </li>
                                <li>
                                    <li>
                                        <Link style={{fontSize: "150%"}} to={"/hostels"}> Hostels</Link>
                                    </li>
                                </li>
                                <li>
                                    <Link style={{fontSize: "150%"}} to={"/restaurants"}> Restaurants</Link>
                                </li>
                                <li>
                                    <li>
                                        <Link style={{fontSize: "150%"}} to={"/pubs"}> Pubs</Link>
                                    </li>
                                </li>
                                <li>
                                    <li>
                                        <Link style={{fontSize: "150%"}} to={"/hospitals"}> Hospitals</Link>
                                    </li>

                                </li>

                                <li>
                                    <li>
                                        <Link style={{fontSize: "150%"}} to={"/parkings"}> Parking</Link>
                                    </li>

                                </li>
                                <li>
                                    <li>
                                        <Link style={{fontSize: "150%"}} to={"/exchangeoffices"}> Exchange offices</Link>
                                    </li>

                                </li>
                                <li>
                                    <li>
                                        <Link style={{fontSize: "150%"}} to={"/touristattractions"}> Tourist attractions</Link>
                                    </li>
                                </li>
                                <li>
                                    <li>
                                        <Link style={{fontSize: "150%"}} to={"/fountains"}> Fountains</Link>
                                    </li>
                                </li>
                            </ul>
                        </div>
                        <div style={{paddingLeft:"105px"}}>
                            <HotelsList></HotelsList>
                        </div>
                    </div>
                </div>

                <Footer></Footer>
            </>
        );
    }
}

export default Hotels;