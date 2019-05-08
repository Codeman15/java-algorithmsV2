const ReactDOM = require('react-dom');
import React from 'react';
import PlotBuilder from './plot/plotBuilder';
const client = require('./client');

class App extends React.Component {                     //takes App from here


    render() {
        return (
            <PlotBuilder />                             //returns plotbuilder file

        );
    }
}

ReactDOM.render(
  <App />,                                              //takes App from above and passes it to the html file
  document.getElementById('root')
);