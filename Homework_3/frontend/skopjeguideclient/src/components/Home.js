import React from "react";
import Header from "./Header";
import Footer from "./Footer";
import {Button} from "@material-ui/core";
import {Link} from "react-router-dom";

export default function Home() {
  return (
    <>
      <Header></Header>
      <div className="row justify-content-center">
        <div className="col-xl-6">
          <div className="section_tittle text-center">
            <h2>Top Places to visit in Skopje</h2>
              <br/>
              <br/>
            <p>
              Skopje is the capital and largest city in Macedonia. It is the
              country's political, cultural, economic, and academic centre.
            </p>
              <br/>
              <br/>

              <Link to={"/hotels"}>
              <Button variant="contained" color="primary">
                  Start Exploring Now
              </Button>
              </Link>

          </div>
        </div>
      </div>
      <Footer></Footer>
    </>
  );
}
