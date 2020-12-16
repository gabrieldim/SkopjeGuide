import React from 'react'

export default function Footer() {
    return (
      <>
        <footer className="footer-area">
          <div className="container">
            <div className="row justify-content-between">
              <div className="col-sm-6 col-md-5">
                <div className="single-footer-widget">
                  <h4>Discover Destination</h4>
                  <ul>
                    <li>
                      <a href="#">Old Bazar</a>
                    </li>
                    <li>
                      <a href="#">Milenium Cross</a>
                    </li>
                    <li>
                      <a href="#">Skopje Fortress</a>
                    </li>
                    <li>
                      <a href="#">Matka Canyon</a>
                    </li>
                  </ul>
                </div>
              </div>
              <div className="col-sm-6 col-md-4">
                <div className="single-footer-widget">
                  <h4>Subscribe to SkopjeGuide</h4>
                  <div className="form-wrap" id="mc_embed_signup">
                    <form
                      target="_blank"
                      action="https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01"
                      method="get"
                      className="form-inline"
                    >
                      <input
                        className="form-control"
                        name="EMAIL"
                        placeholder="Your Email Address"
                        onFocus="this.placeholder = ''"
                        onBlur="this.placeholder = 'Your Email Address '"
                        required=""
                        type="email"
                      ></input>

                      <div style={{ position: "absolute", left: "-5000px" }}>
                        <input
                          name="b_36c4fd991d266f23781ded980_aefe40901a"
                          tabIndex="-1"
                          value=""
                          type="text"
                        ></input>
                      </div>

                      <div className="info"></div>
                    </form>
                  </div>
                </div>
              </div>
              <div className="col-sm-6 col-md-3">
                <div className="single-footer-widget footer_icon">
                  <h4>Contact Us</h4>
                  <p></p>

                  <div className="social-icons">
                    <a href="#">
                      <i className="ti-facebook"></i>
                    </a>
                    <a href="#">
                      <i className="ti-twitter-alt"></i>
                    </a>
                    <a href="#">
                      <i className="ti-pinterest"></i>
                    </a>
                    <a href="#">
                      <i className="ti-instagram"></i>
                    </a>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div className="container-fluid">
            <div className="row justify-content-center">
              <div className="col-lg-12">
                <div className="copyright_part_text text-center">
                  <p className="footer-text m-0">
                    {/* <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --> */}
                    Copyright &copy;
                    <script>document.write(new Date().getFullYear());</script>
                    All rights reserved | This template is made with{" "}
                    <i className="ti-heart" aria-hidden="true"></i> by{" "}
                    <a href="https://colorlib.com" target="_blank">
                      Colorlib
                    </a>
                    {/* <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --> */}
                  </p>
                </div>
              </div>
            </div>
          </div>
        </footer>
      </>
    );
}
