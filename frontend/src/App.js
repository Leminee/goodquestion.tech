import './App.css';
import React, {useState, useEffect} from "react";
import axios from 'axios';





const Test1 = () => {

  const Test2 = () =>{

    axios.get("https://www.goodquestion.tech:8443/brockyou/api/v2/password").then(res =>{ 

    console.log(res);
    });
 };

 useEffect(()=>{ 
   Test2();
 },[]);
 
 return <h1>Test</h1>;

};



function App() {
  return (

    <div className="App">
      
      <Test1/>
    </div>
  );
}

export default App;
