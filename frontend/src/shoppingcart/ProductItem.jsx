import React, { useEffect, useState } from 'react'
import { getProduct, deleteItem,incrementCount,decrementCount} from './ShoppingService'
function ProductItem(props) {
    const [count, setCount] = useState(props.item?.count);

    const handleDelete = (id) => {
        deleteItem(id);
        alert("Xóa thành công!");
        search();
    }
    const decrementCounts = (id) => {
        if(count > 0){
            setCount(count - 1);
            decrementCount(id , count)
        }else{
            alert("sản phẩm luôn dương")
        }
    }
    const incrementCounts = (id) => {
        setCount(count + 1);
        incrementCount(id, count);

    }

    return (
        <div>
            <div className="product-item d-flex border mb-4">
                <div className="image">
                    <img src={props.item?.course?.thumbnail} alt="sản phẩm 1" />
                </div>
                <div className="info d-flex flex-column justify-content-between px-4 py-3 flex-grow-1">
                    <div>
                        <div className="d-flex justify-content-between align-items-center">
                            <h2 className="text-dark fs-5 fw-normal">
                                {props.item?.course?.name}
                            </h2>
                            <h2 className="text-danger fs-5 fw-normal">
                                {/* 300.000 VND */}
                                {props.item?.course?.price.toLocaleString()} VND

                            </h2>
                        </div>
                        <div className="text-black-50">
                            <div className="d-inline-block me-3">
                                <button className="border py-2 px-3 d-inline-block fw-bold bg-light" onClick={() => decrementCounts(props.item?.id)} >-</button>
                                <span className="py-2 px-3 d-inline-block fw-bold">{count}</span>
                                <button className="border py-2 px-3 d-inline-block fw-bold bg-light" onClick={() => incrementCounts(props.item?.id)}>+</button>
                            </div>
                        </div>
                    </div>
                    <div>
                        <button className="text-primary border-0 bg-transparent fw-light" onClick={() => handleDelete(props.item?.id)}>
                            <span><i className="fa-solid fa-trash-can"></i></span>
                            Xóa
                        </button>
                    </div>
                </div>
            </div>

        </div>
    )
}

export default ProductItem
