import React from "react";
import Header from "./Header";
import Footer from "./Footer";

export default function Home() {
  return (
    <>
      <Header></Header>
      <div className="row justify-content-center">
        <div className="col-xl-6">
          <div className="section_tittle text-center">
            <h2>Top Places to visit</h2>
            <p>
              Skopje is the capital and largest city in Macedonia. It is the
              country's political, cultural, economic, and academic centre
            </p>
          </div>
        </div>
      </div>
      <Footer></Footer>
    </>
  );
}
