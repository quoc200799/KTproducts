import axios from 'axios';
const API_ENPOINT = "http://localhost:8080/api/v1"

export const getProduct = () => {
    return axios.get(API_ENPOINT + "/products")
};

export const deleteItem = (id) => {
    return axios.delete(API_ENPOINT + "/products/" + id)
};

export const incrementCount = (id , count) => {
    return axios.put(API_ENPOINT + "/products/" + id + "/increment" , count)
};

export const decrementCount = (id, count) => {
    return axios.put(API_ENPOINT + "/products/" + id + "/decrement", count)
};