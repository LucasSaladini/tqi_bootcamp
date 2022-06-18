import React from 'react'
import * as S from './styled'

const Profile = () => {
  return (
    <S.Wrapper>
        <img src="https://avatars.githubusercontent.com/u/64647470?v=4" alt="Avatar of user" />
          <h1>Lucas Saladini</h1>
          <h3>Username: </h3>
          <span>LucasSaladini</span>
          <div>
            <div>
              <h4>Followers: </h4>
              <span>5</span>
            </div>
            <div>
              <h4>Starreds: </h4>
              <span>5</span>
            </div>
            <div>
              <h4>Followings: </h4>
              <span>5</span>
            </div>
          </div>
    </S.Wrapper>
  )
}

export default Profile