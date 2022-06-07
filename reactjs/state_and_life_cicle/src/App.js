import React, { Component } from 'react';
import  ReactDOM  from 'react-dom';
import './App.css';

class App extends Component {
  constructor(props) {
    super(props)

    this.state = {
      clock: 1000,
      glass: 'Água'
    }
  }

  changeGlass = () => {
    this.setState({
      glass: 'Refrigerante'
    })
  }

  render() {
    const { clock, glass } = this.state
    return (
      <div className='App'>
        <h1>{clock}</h1>
        <button onClick={() => this.changeGlass()}>Trocar bebida</button>
      </div>
    )
  }
}

export default App;
