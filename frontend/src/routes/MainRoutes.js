import React, { lazy } from 'react';
// import { lazy } from 'react';

// project imports
import MainLayout from '../layout/MainLayout';
import Loadable from '../ui-component/Loadable';

// dashboard routing
const DashboardDefault = Loadable(lazy(() => import('../views/dashboard/Default')));

// utilities routing
const UtilsTypography = Loadable(lazy(() => import('../views/utilities/Typography')));
const UtilsColor = Loadable(lazy(() => import('../views/utilities/Color')));
const UtilsShadow = Loadable(lazy(() => import('../views/utilities/Shadow')));
const UtilsTablerIcons = Loadable(lazy(() => import('../views/utilities/TablerIcons')));

// sample page routing
const SamplePage = Loadable(lazy(() => import('../views/sample-page')));

// ==============================|| MAIN ROUTING ||============================== //

const MainRoutes = {
    path: '/',
    element: <MainLayout />,
    children: [
        {
            path: '',
            element: <DashboardDefault />
        },
        {
            path: 'dashboard/default',
            element: <DashboardDefault />
        },
        {
            path: 'utils/util-typography',
            element: <UtilsTypography />
        },
        {
            path: 'utils/util-color',
            element: <UtilsColor />
        },
        {
            path: 'utils/util-shadow',
            element: <UtilsShadow />
        },
        {
            path: 'icons/tabler-icons',
            element: <UtilsTablerIcons />
        },
        {
            path: 'sample-page',
            element: <SamplePage />
        }
    ]
};

export default MainRoutes;
