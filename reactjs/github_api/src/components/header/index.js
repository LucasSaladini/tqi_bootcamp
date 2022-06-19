import React from 'react'
import * as S from './styled'

const Header = () => {
  return (
    <header>
        <S.Wrapper>
            <input type='text' placeholder='Digite o username para pesquisa'/>
            <button type='submit'><span>Pesquisar</span></button>
        </S.Wrapper>
    </header>
  )
}

export default Header