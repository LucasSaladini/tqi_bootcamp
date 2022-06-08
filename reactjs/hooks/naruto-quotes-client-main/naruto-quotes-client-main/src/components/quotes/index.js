import styled from "styled-components";
import { string } from 'prop-types';

export const Quotes = ({ quote, speaker }) => {
    return (
        <Wrapper>
            <Quote>{quote}</Quote>
            <Speaker>- {speaker}</Speaker>
            <button>Quote No Jutsu</button>
        </Wrapper>
    )
}

Quotes.propTypes = {
    quote: string,
    speaker: string
}

const Wrapper = styled.div`
    flex: 1;
    display: flex;
    flex-direction: column;
    align-items: center;
`;

const Quote = styled.p`
    font-size: 2em;
    flex: 1;
    margin: 0px;
`;

const Speaker = styled(Quote)`
    text-align: right;
    margin: 50px;
`;