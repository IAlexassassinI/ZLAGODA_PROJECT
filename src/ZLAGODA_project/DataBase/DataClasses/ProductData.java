package ZLAGODA_project.DataBase.DataClasses;

import ZLAGODA_project.DataBase.Exeptions.InvalidValueException;

public class ProductData {

    public ProductData(){}
    public ProductData(
    Integer id_product,
    Integer category_number,
    String product_name,
    String characteristics
    )
    {
        _id_product = id_product;
        _category_number = category_number;
        _product_name = product_name;
        _characteristics = characteristics;
    }
    public ProductData(
            String id_product,
            String category_number,
            String product_name,
            String characteristics
    ) throws InvalidValueException {
        try {
            _id_product = Integer.valueOf(id_product);
            _category_number = Integer.valueOf(category_number);
        }
        catch (Exception e){
            throw new InvalidValueException();
        }

        _product_name = product_name;
        _characteristics = characteristics;
    }


    public Integer _id_product = null;
    public Integer _category_number = null;
    public String _product_name = null;
    public String _characteristics = null;


}
