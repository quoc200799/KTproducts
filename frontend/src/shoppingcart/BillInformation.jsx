import React from 'react'

function BillInformation(props) {
    const totalprice = () =>{
       return props.list.reduce((sum, item) => sum + (item?.course?.price * item?.count), 0);
    }
    const vatprice = () =>{
        return totalprice() * 0.1;
     }
     const total = () =>{
        return totalprice()  + vatprice();
     }
// console.log(totalprice());
// console.log(vatprice());

  return (
    <div className="bill">
    <div className="border mb-2 p-3 fs-5 fw-normal d-flex justify-content-between align-items-center">
        <span className="text-black-50">Tạm tính:</span>
        <span className="text-primary" id="sub-total-money">{totalprice().toLocaleString()} VND</span>
    </div>
    <div className="border mb-2 p-3 fs-5 fw-normal d-flex justify-content-between align-items-center">
        <span className="text-black-50">VAT (10%):</span>
        <span className="text-primary" id="vat-money">{vatprice().toLocaleString()}</span>
    </div>
    <div className="border mb-2 p-3 fs-5 fw-normal d-flex justify-content-between align-items-center">
        <span className="text-black-50">Thành tiền:</span>
        <span className="text-primary" id="total-money">{total().toLocaleString()}</span>
    </div>
</div>
  )
}

export default BillInformation
