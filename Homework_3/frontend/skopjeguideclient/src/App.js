import { BrowserRouter as Router, Switch, Route, Link } from 'react-router-dom';
import Home from './components/Home';
import About from './components/About';
import Places from './components/Places';

function App() {
  return (
    <Router>
      <Switch>
        <Route exact path={"/"} component={Home}></Route>
        <Route exact path={"/about"} component={About}></Route>
        <Route exact path={"/places"} component={Places}></Route>
      </Switch>
    </Router>
  );
}

export default App;
