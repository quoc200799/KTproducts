import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import ShoppingCart from './shoppingcart/ShoppingCart'

function App() {
  const [count, setCount] = useState(0)

  return (
    <div className="App">
    <ShoppingCart />
    </div>
  )
}

export default App
