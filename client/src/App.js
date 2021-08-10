import React from "react";
import {Container} from "react-bootstrap";
import Navbar from "react-bootstrap/Navbar";
import './App.css';

export default function App() {
    return(
        <Navbar id = "NavBar" bg="dark" variant="dark">
            <Container>
                <Navbar.Brand href="/home">AR Salon and Day Spa Services</Navbar.Brand>
            </Container>
        </Navbar>
    );
}







