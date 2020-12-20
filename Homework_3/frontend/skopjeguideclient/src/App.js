import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import Home from './components/Home';
import About from './components/About';
import Restaurants from './components/Restaurants';
import Pubs from "./components/Pubs";
import Hotels from "./components/Hotels";
import Hostels from "./components/Hostels";
import Hospitals from "./components/Hospitals";
import Parking from "./components/Parking";
import ExchangeOffices from "./components/ExchangeOffices";
import Fountains from "./components/Fountains";
import TouristAttractions from "./components/TouristAttractions";
import LocationMapView from "./components/LocationMap/LocationMapView";

import './index.css';

function App() {
  return (
    <Router>
      <Switch>
        <Route exact path={"/"} component={Home}></Route>
        <Route exact path={"/about"} component={About}></Route>
        <Route exact path={"/restaurants"} component={Restaurants}></Route>
          <Route exact path={"/pubs"} component={Pubs}></Route>
          <Route exact path={"/hotels"} component={Hotels}></Route>
          <Route exact path={"/hostels"} component={Hostels}></Route>
          <Route exact path={"/hospitals"} component={Hospitals}></Route>
          <Route exact path={"/parkings"} component={Parking}></Route>
          <Route exact path={"/exchangeoffices"} component={ExchangeOffices}></Route>
          <Route exact path={"/touristattractions"} component={TouristAttractions}></Route>
          <Route exact path={"/fountains"} component={Fountains}></Route>
        <Route exact path={"/map"} component={LocationMapView}></Route>
      </Switch>
    </Router>
  );
}

export default App;
