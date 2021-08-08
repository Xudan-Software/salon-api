import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import Navbar from "react-bootstrap/Navbar";
import {Container} from "react-bootstrap";

function NavBar(){
    return(
        <Navbar id = "NavBar" bg="dark" variant="dark">
            <Container>
                <Navbar.Brand href="/home">AR Salon and Day Spa Services</Navbar.Brand>
            </Container>
        </Navbar>
    );
}

ReactDOM.render(
    <NavBar />,
  document.getElementById('root')
);

