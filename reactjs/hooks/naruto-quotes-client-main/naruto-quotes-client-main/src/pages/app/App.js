import styled from 'styled-components';
import narutoImg from '../../images/naruto.png';

export function App() {
  return (
    <Container>
      <NarutoImg src={narutoImg} alt="Naruto com uma kunai" />
    </Container>
  )
}

const Container = styled.div`
  height: 100vh;
  padding: 0;
  margin: 0 50px;
  display: flex;
  justify-content: center;
  align-items: center;
`; 

const NarutoImg = styled.img`
  max-width: 50vw;
  align-self: flex-end;
`;