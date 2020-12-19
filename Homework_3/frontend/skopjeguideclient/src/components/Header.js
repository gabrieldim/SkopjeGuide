import React from "react";
import { Link } from "react-router-dom";

export default function Header() {
  return (
    <div className="main_menu_iner">
      <div className="container">
        <div className="row align-items-center ">
          <div className="col-lg-12">
            <nav className="navbar navbar-expand-lg navbar-light justify-content-between">
              <Link to={"/"} className="navbar-brand">
                {" "}
                <img src="assets/version1.png" style={{maxWidth:"100px"}}  alt="logo"></img>
              </Link>
              <button
                className="navbar-toggler"
                type="button"
                data-toggle="collapse"
                data-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent"
                aria-expanded="false"
                aria-label="Toggle navigation"
              >
                <span className="navbar-toggler-icon"></span>
              </button>

              <div
                className="collapse navbar-collapse main-menu-item justify-content-center"
                id="navbarSupportedContent"
              >
                <ul className="navbar-nav">
                  <li className="nav-item">
                    <Link to={"/"} className="nav-link">
                      Home
                    </Link>
                  </li>
                  <li className="nav-item">
                    <Link to={"/hotels"} className="nav-link">
                      Places
                    </Link>
                  </li>
                  <li className="nav-item">
                    <Link to={"/about"} className="nav-link">
                      About us
                    </Link>
                  </li>
                </ul>
              </div>
            </nav>
          </div>
        </div>
      </div>
    </div>
  );
}
