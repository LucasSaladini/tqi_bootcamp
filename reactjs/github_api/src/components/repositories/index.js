import React from 'react'
import RepositoryItem from '../repository-item'
import * as S from './styled'

const Repositories = () => {
    return (
        <S.WrapperTabs selectedTabClassName="is-selected" selectedTabPanelClassName="is-selected">
            <S.WrapperTabList>
                <S.WrapperTab>Repositoires</S.WrapperTab>
                <S.WrapperTab>Starred</S.WrapperTab>
            </S.WrapperTabList>
            <S.WrapperTabPanel>
                <RepositoryItem name='calculator' 
                    linkToRepo='https://github.com/LucasSaladini/calculator'
                    fullName='lucassaladini/calculator'
                    />
            </S.WrapperTabPanel>
            <S.WrapperTabPanel>
            <RepositoryItem name='filmesAPI' 
                    linkToRepo='https://github.com/LucasSaladini/filmesAPI'
                    fullName='lucassaladini/filmesAPI'
                    />
            </S.WrapperTabPanel>
        </S.WrapperTabs>
    )
}

export default Repositories