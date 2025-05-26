package com.bupt.charger.service;

import com.bupt.charger.dto.response.AllBillsByDayResponse;
import com.bupt.charger.dto.response.AllBillsResponse;
import com.bupt.charger.dto.response.BillResponse;
import com.bupt.charger.dto.response.DetailedBillResponse;
import com.bupt.charger.entity.Bill;

public interface BillService {
    DetailedBillResponse getBill(long billId);

    AllBillsResponse checkBill(String carId);

    AllBillsByDayResponse checkBillByDay(String carId);

    //    导出所有详单，账单函数入口
    void exportAll();

    //    导出详单到本地文件
    void exportBill(Bill bill);

    //  导出指定账单到本地
    void exportOrder(BillResponse billResponse);
}
