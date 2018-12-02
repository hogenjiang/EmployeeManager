package DAO;

import Models.Province;

import java.util.ArrayList;

public interface ProvinceDAO {
    public ArrayList<Province> getAllProvince();
    public Province getProvince(int provinceID);
}
