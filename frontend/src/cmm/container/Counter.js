import React, { useState } from 'react'
import '../../App.css';

const App = () => {
  const [ count, setCount ] = useState(0)
  const onIncrease = () => { setCount(count+1) }
  const onDecrease = () => { setCount(count-1) }

  return (
    <>
      <div className="topnav">
        <a className="active" href="#home">Home</a>
        <a href="#news">News</a>
        <a href="#contact">Contact</a>
        <div className="topnav_right">
          <a href="#search">Search</a>
          <a href="#about">About</a>
        </div>
        <h1>카운더 : {count}</h1>
        <button onClick={onIncrease}> 증가 </button>
        <button onClick={onDecrease}> 감소 </button>
      </div>  
    </>
  )
}

export default App
