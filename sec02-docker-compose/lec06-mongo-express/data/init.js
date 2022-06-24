db = db.getSiblingDB('product-service');

db.createCollection('products');

db.products.insertMany(
    [
        {
            "name":"iphone",
            "price": "1200"
        },
        {
            "name":"ipad",
            "price": "800"
        },
        {
            "name":"mac",
            "price": "3000"
        }                
    ]
)