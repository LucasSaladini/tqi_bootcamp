import React from 'react';
import './App.css';

const buttonA = <button>Histórico de clientes</button>
const buttonB = <button>Cadastrar cliente</button>

const hasCostumer = false

const App = () => {

  const renderShowHistory = () => (
    <div>
      Clique no botão abaixo para visualizar o histórico dos clientes
      <br />
      {buttonA}
    </div>
  )

  const renderAddCustomer = () => (
    <div>
      Clique no botão abaixo para cadastrar um novo cliente
      <br />
      {buttonB}
    </div>
  )

  const showCustomer = () => {
    if(!hasCostumer) return null

    return (
      <div>
        <h1>Nome do cliente: Lucas Saladini</h1>
      </div>
    )
  }

  return (
    <div>
      <p>Digital Innovation One</p>
      <p>Bem-vindo a nossa aula =D</p>
      {/* {hasCostumer && (
        <div>
          Clique no botão abaixo para visualizar o histórico dos clientes
          <br />
          {buttonA}
        </div> }
      )*/}

      {hasCostumer ? renderShowHistory() : renderAddCustomer()}
      <div>
        {showCustomer()}
      </div>
    </div>
  )
}

export default App;
