const ReactDOM = require('react-dom');
import React from 'react';
import PlotBuilder from './plot/plotBuilder';
const client = require('./client');

class App extends React.Component { //takes App from here



    render() {
        return (
        <div>
        <h2>Sort</h2>
           <PlotBuilder type={"sort"} /> //returns plotbuilder file with sort
        <h2>Shuffle</h2>
            <PlotBuilder type={"shuffle"} /> //returns plotbuilder file with shuffle
        <h2>Last</h2>
            <PlotBuilder type={"last"} /> //returns plotbuilder file with last
        <h2>Duplicate</h2>
            <PlotBuilder type={"duplicate"} /> //returns plotbuilder file with duplicate
        <h2>My Shuffle</h2>
            <PlotBuilder type={"myShuffle"} /> //returns plotbuilder file with shuffle
        <h2>Reverse</h2>
            <PlotBuilder type={"reverse"} /> //returns plotbuilder file with reverse
        </div>

        );
    }
}

ReactDOM.render(
  <App />, //takes App from above and passes it to the html file
  document.getElementById('root')
);