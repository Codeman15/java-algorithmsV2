import React from 'react';
import Plotter from './plotter'
const client = require('../client');

class PlotBuilder extends React.Component {
  constructor(props) {
    super(props)
    this.state = {data: null};                                  //set the data as null
  }

  componentDidMount() {
    client({method: 'GET', path: '/api/'}).then(response => {   //gets data from the API (localhost:8080/api)
      this.setState({data: response.entity});                   //sets it to state
    });
  }

	render() {
	let blankPlot;
    if(this.state.data !== null) {                              //when data is not null
		blankPlot = <Plotter info={this.state.data}/>           //goes to the plotter file with data
		}
	return (
	<div>
          {blankPlot}
          </div>
        		)
	}
}

export default PlotBuilder;