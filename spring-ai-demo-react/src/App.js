import React, { useState } from 'react';
import './App.css';
import Image from './components/Image';
import Chat from './components/Chat';
import Email from './components/Email';
import Audio from './components/Audio';
import Summary from "./components/Summary";

function App() {

  return (
    <div className="App">
      <Audio />
      <Image />
      <Chat />
      <Summary />
      <Email />
    </div>
  );
}

export default App;
