import React from 'react';

const listCustomer = [
  {
    id: 1,
    name: 'Lucas Saladini',
    skills: ['React', 'Node', 'CSS', 'Webpack']
  },
  {
    id: 2,
    name: 'Aline Carneiro',
    skills: ['React Native', 'HTML', 'Go', 'JS']
  },
  {
    id: 3,
    name: 'Fulano de Tal',
    skills: ['Assembly']
  },
  {
    id: 4,
    name: 'José Ciclano',
    skills: ['Reason']
  }
]

const App = () => {
  const renderCustomers = (customer, idex) => {
    return (
      <div key={`customer-${customer.id}`}>
        <li>{customer.name}</li>
        {customer.skills.map(renderSkills)}
      </div>
    )
  }

  const renderSkills = (skill, index) => {
    return (
      <div style={{ paddingLeft: '30px'}} key={`skill-${index}`}>
        <li>{skill}</li>
      </div>
    )
  }

  return (
    <div className="App">
      <div>
        <ul>
          {listCustomer.map(renderCustomers)}
        </ul>
      </div>
    </div>
  )
}

export default App;
