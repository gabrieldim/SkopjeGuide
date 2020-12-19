import React, {useEffect} from 'react';
import { makeStyles } from '@material-ui/core/styles';
import List from '@material-ui/core/List';
import ListItem from '@material-ui/core/ListItem';
import ListItemSecondaryAction from '@material-ui/core/ListItemSecondaryAction';
import ListItemText from '@material-ui/core/ListItemText';
import ListItemAvatar from '@material-ui/core/ListItemAvatar';
import {Icon} from "@material-ui/core";

const useStyles = makeStyles((theme) => ({
    root: {
        width: '100%',
        maxWidth: 360,
        backgroundColor: theme.palette.background.paper,
    },
}));

const fetchData = () => {
    return fetch('https://skopje-guide.herokuapp.com/api/hostels')
        .then(data => data.json());
}

export default function HostelsList() {
    const classes = useStyles();
    const [hotels, setHotels] = React.useState([]);

    useEffect(() => {
        let mounted = true;
        fetchData().
        then(items => {
            if(mounted) {
                setHotels(items)
            }
        })
        return () => mounted = false;
    }, [])

    return (
        <>
            <h2>Hostels:</h2>
            <List dense className={classes.root}  style={{width:"175%"}}>
                { hotels && hotels.map((value, index) => {
                    const labelId = `checkbox-list-secondary-label-${index}`;
                    return (

                        <ListItem key={value.id} button >
                            <ListItemAvatar>
                                <Icon className="fas fa-hotel" style={{color: "grey"}}></Icon>
                            </ListItemAvatar>
                            <ListItemText id={labelId} primary={`${value.name}`} />
                            <br/>
                            <br/>
                            <ListItemSecondaryAction>
                            </ListItemSecondaryAction>
                        </ListItem>
                    );
                })}
            </List>
        </>
    );
}