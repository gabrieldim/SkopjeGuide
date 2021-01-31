import React, {useEffect} from 'react';
import { makeStyles } from '@material-ui/core/styles';
import List from '@material-ui/core/List';
import ListItem from '@material-ui/core/ListItem';
import ListItemSecondaryAction from '@material-ui/core/ListItemSecondaryAction';
import ListItemText from '@material-ui/core/ListItemText';
import ListItemAvatar from '@material-ui/core/ListItemAvatar';
import {CircularProgress, Icon} from "@material-ui/core";
import LocationMapView from "../LocationMap/LocationMapView";

const useStyles = makeStyles((theme) => ({
    root: {
        width: '100%',
        maxWidth: 360,
        backgroundColor: theme.palette.background.paper,
    },
}));

const fetchData = () => {
    return fetch('https://skopjeguide.francecentral.cloudapp.azure.com/api/restaurants')
        .then(data => data.json());
}

export default function RestaurantsList() {
    const classes = useStyles();
    const [restaurants, setRestaurants] = React.useState([]);

    const [loading, setLoading] = React.useState(true);



    useEffect(() => {
        let mounted = true;
        fetchData().
        then(items => {
            if(mounted) {
                setRestaurants(items)
                setLoading(false)
            }
        })

        return () => mounted = false;
    }, [])

    if(loading) {
        return (<>
            <div style={{paddingLeft: "100px", paddingTop: "100px"}}>
                <h3>Loading ...</h3> <CircularProgress />
            </div>
        </>);
    } else {
        return (
            <>
                <h2>Restaurants:</h2>
                <List dense className={classes.root} style={{width: "175%"}}>
                    {restaurants && restaurants.map((value, index) => {
                        const labelId = `checkbox-list-secondary-label-${index}`;
                        return (
                            <div style={{height: "300px", width: "500px"}}>
                                <div style={{float: "left"}}>
                                    <br/>
                                    <br/>
                                    <ListItem key={value.id} button>
                                        <ListItemAvatar>
                                            <Icon className="fas fa-utensils" style={{color: "grey"}}></Icon>
                                        </ListItemAvatar>
                                        <ListItemText id={labelId} primary={`${value.name}`}/>
                                        <br/>

                                        <br/>
                                    </ListItem>

                                </div>
                                <div style={{height: "300px", width: "500px", float: "right"}}>
                                    <LocationMapView lat={value.lat} lon={value.lon} name={value.name}></LocationMapView>
                                </div>
                            </div>
                        );
                    })}
                </List>
            </>
        );
    }
}