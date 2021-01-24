import React from 'react'
import Header from "./Header";
import Footer from "./Footer";


export default function About() {
    return (
      <>
        <Header></Header>
        <h2 style={{ textAlign: "center" }}>About Us</h2>
        <div style={{ margin: "100px" }}>
          <p>
            Skopje, as the capital and largest city of our country, is a major
            attraction and tourist magnet for many tourists from around the
            world. It abounds in a number of tourist attractions (monuments,
            museums), as well as a number of cafes and restaurants recognizable
            by our rich cuisine. So, our goal is to make it easier for tourists
            who would like to rent a car to find a "Rent a Car". Given that
            every year Skopje is full of a huge number of tourists, we decided
            to design and create a so-called Skopje Guide in the form of a web
            application that will be of great help to tourists to manage and
            find the most recognizable places in our city. This application will
            be available under the name "Skopje Guide" and in addition to
            Macedonian will be available in English for foreign tourists. It can
            be accessed from all web browsers Google Chrome, Mozilla Firefox,
            Internet Explorer, Safari etc.
          </p>
        </div>
        <Footer></Footer>
      </>
    );
}