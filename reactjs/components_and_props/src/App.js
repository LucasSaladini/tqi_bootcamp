import React from 'react';
import  ReactDOM  from 'react-dom';
import Button from './Button';
import './App.css';

function sum(a, b) {
  alert(a + b)
}

function App() {
  return (
    <div className="App">
      Hello World <br />
      <Button onClick={() => sum(10, 20)} name="Lucas" />
    </div>
  );
}

export default App;
