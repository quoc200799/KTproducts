import React from 'react'
import ProductItem from './ProductItem'

function ProductList(props) {
    console.log(props.list);
  return (
    <div className="col-md-8">
    <div className="product-list">
    {props.list.map(e =>
        <ProductItem 
            item = {e}
            key = {e.id}
        />
    )}
    </div>
</div>
  )
}

export default ProductList
