import './App.css';
import React, {useState,useEffect} from "react";
import axios from 'axios';


const ServerData = () => {

   const [activeUserNow, getActiveUserNow] = useState([]);
   const [activeUserRecord, getActiveUserRecord] = useState([]);
   const [serverMemberAmount, getServerMemberAmount] = useState([]);
   const [amountMessages, getAmountMessages] = useState([]);
   const [newUserName, getNewUserName] = useState([]);
   const [newUserJoiningTime, getNewUserJoiningTime] = useState([]);


   const fetchServerData = () =>{


      axios.get("http://localhost:5050/api/v1/active-user/now").then(res =>{

    getActiveUserNow(res.data);
    });

      axios.get("http://localhost:5050/api/v1/active-user/record").then(res =>{

         getActiveUserRecord(res.data);
      });

      axios.get("http://localhost:5050/api/v1/server-member/amount").then(res =>{

          getServerMemberAmount(res.data);
      });

      axios.get("http://localhost:5050/api/v1/amount-messages/total").then(res =>{

          getAmountMessages(res.data)
      });

      axios.get("http://localhost:5050/api/v1/new-user/name").then(res =>{

          getNewUserName(res.data)
      });

      axios.get("http://localhost:5050/api/v1/new-user/time").then(res =>{

          getNewUserJoiningTime(res.data)
      });

 };

 useEffect(()=>{ 
   fetchServerData();
 },[]);

 
 return (

     <div>

     <h3>Online</h3>
     <p>{activeUserNow}</p>
     <h3>Record</h3>
     <p>{activeUserRecord}</p>
     <h3>Servermitglieder</h3>
     <p>{serverMemberAmount}</p>
     <h3>Nachrichten</h3>
     <p>{amountMessages}</p>
     <h3>Neues Mitglied</h3>
     <p>{newUserName}</p>
     <h3>Gejoint am</h3>
     <p>{newUserJoiningTime}</p>

     </div>

 )

};



function App() {
  return (

    <div className="App">
      <ServerData/>
    </div>
  );
}

export default App;
