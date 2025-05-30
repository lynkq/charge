package com.bupt.charger.dto.response;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AllBillsResponse extends Resp {
    List<BillResponse> bills = new ArrayList<>();
}
