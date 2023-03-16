import React,{useEffect, useState} from 'react'
import BillInformation from './BillInformation'
import ProductList from './ProductList'
import {getProduct} from './ShoppingService'

function ShoppingCart() {
    const [list, setList] = useState([]);
    useEffect(() => {
        search();
      }, [])
      const search = () => {
        getProduct()
          .then((res) => setList(res.data))
          .catch(e => alert("Lỗi hệ thống"))
      };
  return (
    <div>
         <div className="shopping-cart-container mt-5">
        <div className="container">
            <div className="row">
                <div className="col-md-12">
                    <div className="mb-4">
                        <h2>Shopping Cart</h2>
                    </div>
                </div>
            </div>

            <p className="fst-italic message">Không có sản phẩm trong giỏ hàng</p>
            <div className="row shopping-cart">
              <ProductList 
                list ={list}
              />
                <div className="col-md-4">
                   <BillInformation 
                     list ={list}
                   />
                </div>
            </div>
        </div>
    </div>
    </div>
  )
}

export default ShoppingCart
