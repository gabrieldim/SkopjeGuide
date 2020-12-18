import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import List from '@material-ui/core/List';
import ListItem from '@material-ui/core/ListItem';
import ListItemSecondaryAction from '@material-ui/core/ListItemSecondaryAction';
import ListItemText from '@material-ui/core/ListItemText';
import ListItemAvatar from '@material-ui/core/ListItemAvatar';

const useStyles = makeStyles((theme) => ({
    root: {
        width: '100%',
        maxWidth: 360,
        backgroundColor: theme.palette.background.paper,
    },
}));

export default function CheckboxListSecondary() {
    const classes = useStyles();
    const [checked, setChecked] = React.useState([1]);

    return (
        <List dense className={classes.root}  style={{width:"175%"}}>
            {[0, 1, 2, 3].map((value) => {
                const labelId = `checkbox-list-secondary-label-${value}`;
                return (
                    <ListItem key={value} button >
                        <ListItemAvatar>
                            <p>Ilustation </p>
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