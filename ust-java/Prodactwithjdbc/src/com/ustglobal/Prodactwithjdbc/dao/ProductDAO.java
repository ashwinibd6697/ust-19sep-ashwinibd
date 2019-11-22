package com.ustglobal.Prodactwithjdbc.dao;

import java.util.List;

import com.ustglobal.Prodactwithjdbc.dto.ProductBean;

public interface ProductDAO {
    public List<ProductBean> retriveProducts();
    public ProductBean searchProduct(int id);
    public int insertProduct(ProductBean b);
    public int deleteProduct(ProductBean b);
    public int updateProduct(ProductBean b);
}
