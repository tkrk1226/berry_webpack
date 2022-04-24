import React from 'react';
import { useRoutes } from 'react-router-dom';

// routes
import MainRoutes from './MainRoutes';
import AuthenticationRoutes from './AuthenticationRoutes';
import config from '../config';

// ==============================|| ROUTING RENDER ||============================== //

export default function ThemeRoutes() {
    console.log(MainRoutes)
    return useRoutes([MainRoutes, AuthenticationRoutes], config.basename);
}
