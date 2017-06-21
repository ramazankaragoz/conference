var webpack = require('webpack');

module.exports = {
    entry: [
        './public/app.jsx',
    ],
    output: {
        path: __dirname,
        filename: './public/bundle.js'
    },
    resolve: {
        root: __dirname,
        alias: {
            Employee: 'public/components/Employee//Employee.jsx',
            About: 'public/components/About.jsx',
            Conference: 'public/components/Conference.jsx',
            Main: 'public/components/Main.jsx',
            NavR: 'public/components/NavR.jsx',
            CreateEmployee:'public/components/Employee/CreateEmployee.jsx',
            UpdateEmployee:'public/components/Employee/UpdateEmployee.jsx',
            DeleteEmployee:'public/components/Employee/DeleteEmployee.jsx'
        },
        extensions: ['', '.js', '.jsx']
    },
    module: {
        loaders: [
            {
                loader: 'babel-loader',
                query: {
                    presets: ['react', 'es2015', 'stage-0']
                },
                test: /\.jsx?$/,
                exclude: /(node_modules|bower_components)/
            }
        ]
    }
};
