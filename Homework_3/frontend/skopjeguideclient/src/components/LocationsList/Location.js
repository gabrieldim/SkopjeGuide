import React, {Component} from 'react';
import List from "@material-ui/core/List";
import ListItem from "@material-ui/core/ListItem";
import ListItemAvatar from "@material-ui/core/ListItemAvatar";
import ListItemText from "@material-ui/core/ListItemText";
import ListItemSecondaryAction from "@material-ui/core/ListItemSecondaryAction";

class Location extends Component {
    constructor(props) {
        super(props);
        this.state = {
            restaurants: []
        }
    }

    state = {
        restaurants: []
    }

    async componentDidMount() {
        const data = await fetch('https://skopje-guide.herokuapp.com/api/restaurants');
        const json = await data.json();
        
        this.state.restaurants = json;

        this.setState()
        //
        // let list = document.getElementById("locationsList");
        //
        // for(let i=0; i<json.length; i++) {
        //     list.innerHTML += `<li>${json[i].lon} ${json[i].lat}  ${json[i].name} ${json[i].website}  ${json[i].phone}</li>`;
        // }
    }

    render() {
        return (
            <List dense style={{width:"175%"}}>
                {this.state.restaurants.map((value) => {
                    const labelId = `checkbox-list-secondary-label-${value}`;
                    return (
                        <ListItem key={value} button >
                            <ListItemAvatar>
                                <p>value.name </p>
                            </ListItemAvatar>
                            <ListItemText id={labelId} primary={`Line item ${value + 1}`} />
                            <br/>
                            <br/>
                            <ListItemSecondaryAction>

                            </ListItemSecondaryAction>
                        </ListItem>
                    );
                })}
            </List>
        );
    }
}


export default Location;