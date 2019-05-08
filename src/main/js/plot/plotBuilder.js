import React from 'react';
import Plotter from './plotter'
const client = require('../client');

class PlotBuilder extends React.Component {
  constructor(props) {
    super(props)
    this.state = {data: null}; //set the data to the value null
  }

  componentDidMount() {
    client({method: 'GET', path: '/api/' + this.props.type}).then(response => { //gets data from the API (localhost:8080/api/endpoint specified in API controller file)
      this.setState({data: response.entity}); //sets that to state
    });
  }

	render() {
	let blankPlot;
    if(this.state.data !== null) {                              //when data is not null
		blankPlot = <Plotter info={this.state.data}/>           //go to the plotter file with data
		}
	return (
	<div>
          {blankPlot}
          </div>
        		)
	}
}

export default PlotBuilder;