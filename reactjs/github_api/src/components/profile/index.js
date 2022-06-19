import React from 'react'
import * as S from './styled'
import useGithub from '../../hooks/github-hooks'

const Profile = () => {
    const { githubState } = useGithub()
  return (
    <S.Wrapper>
        <S.Image src="https://avatars.githubusercontent.com/u/64647470?v=4" alt="Avatar of user" />
        <S.WrapperInfoUser>
            <div>
                <h1>{githubState.user.name}</h1>
                <S.WrapperUsername>
                    <h3>Username: </h3>
                    <a href='https://github.com/LucasSaladini' target="_blank" rel="noreferrer">LucasSaladini</a>
                </S.WrapperUsername>
            </div>
            <S.WrapperStatusCount>
                <div>
                <h4>Followers</h4>
                <span>5</span>
                </div>
                <div>
                <h4>Starred</h4>
                <span>5</span>
                </div>
                <div>
                <h4>Followings</h4>
                <span>5</span>
                </div>
            </S.WrapperStatusCount>
        </S.WrapperInfoUser>
    </S.Wrapper>
  )
}

export default Profile