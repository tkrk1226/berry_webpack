import React from 'react';

// material-ui
import { Grid, Typography } from '@mui/material';

// project imports
import { gridSpacing } from '../../../store/constant';

// ==============================|| DEFAULT DASHBOARD ||============================== //

const Dashboard = () => {

    return (
        <Grid container spacing={gridSpacing}>
            <Grid>
                <Typography variant="h1">
                    this is default
                </Typography>
            </Grid>
        </Grid>
    );
};

export default Dashboard;
