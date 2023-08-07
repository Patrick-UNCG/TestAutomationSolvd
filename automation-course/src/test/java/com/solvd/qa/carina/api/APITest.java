package com.solvd.qa.carina.api;

import com.zebrunner.carina.core.IAbstractTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class APITest implements IAbstractTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    @Test
    public void getProduct(){
        GetProductMethod getProductMethod = new GetProductMethod();
        getProductMethod.callAPIExpectSuccess();
        getProductMethod.validateResponse();
        getProductMethod.validateResponseAgainstSchema("api/products/_get/rs.schema");
    }

    @Test()
    public void createProduct() {
        PostProductMethod postProductMethod = new PostProductMethod();
        postProductMethod.callAPIExpectSuccess();
    }

    @Test()
    public void deleteProduct(){
        DeleteProductMethod deleteProductMethod = new DeleteProductMethod();
        deleteProductMethod.callAPIExpectSuccess();
    }

    @Test()
    public void updateProduct(){
        PutProductMethod putProductMethod = new PutProductMethod();
        putProductMethod.callAPIExpectSuccess();
    }

}
