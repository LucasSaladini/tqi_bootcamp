import React, { useEffect, useState } from 'react'
import RepositoryItem from '../repository-item'
import useGithub from '../../hooks/github-hooks'
import * as S from './styled'

const Repositories = () => {
    const {githubState, getUserRepos} = useGithub()

    const [hasUserForSearchRepos, setHasUserForSearchRepos] = useState(false)

    useEffect(() => {
        if(!!githubState.user.login) {
            getUserRepos()
        }
        setHasUserForSearchRepos(!!githubState.repositories)
    }, [getUserRepos, githubState.repositories, githubState.user.login])

    return (
        <>
            {hasUserForSearchRepos ? 
                <S.WrapperTabs selectedTabClassName="is-selected" selectedTabPanelClassName="is-selected">
                    <S.WrapperTabList>
                        <S.WrapperTab>Repositoires</S.WrapperTab>
                        <S.WrapperTab>Starred</S.WrapperTab>
                    </S.WrapperTabList>
                    <S.WrapperTabPanel>
                        {githubState.repositories.map(item => 
                            <RepositoryItem 
                                name={item.name} 
                                key={item.id}
                                linkToRepo={item.owner.html_url}
                                fullName={item.full_name}
                            />
                        )}
                    </S.WrapperTabPanel>
                    <S.WrapperTabPanel>
                    {githubState.starred.map(item => 
                        <RepositoryItem 
                            name='calculator' 
                            key={item.id}
                            linkToRepo='https://github.com/LucasSaladini/calculator'
                            fullName='lucassaladini/calculator'
                        />
                    )}
                    </S.WrapperTabPanel>
                </S.WrapperTabs>
            : <></>}
        </>
    )
}

export default Repositories