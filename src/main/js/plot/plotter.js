import React from 'react';
import Plot from 'react-plotly.js';

class Plotter extends React.Component {
  constructor(props) {
    super(props)
//    let xe = [1,2,3];
//    let ye = [2,3,5];
    console.log(this.props.info);
    console.log(this.props.info.x);
    console.log(this.props.info.y);
  }

	render() {
let xtmp = this.props.info.x;
let ytmp = this.props.info.y;
		return (

            <Plot
              data={[
                {
                  x: this.props.info.x,
                  y: this.props.info.y,
                  z: [1, 5, 2],
                  type: 'scatter',
                  mode: 'lines+points',
                  marker: {color: 'blue'},
                },

              ]}
              layout={ {width: 800, height: 600, title: 'Chart'} }
            />
		)
	}
}

export default Plotter;