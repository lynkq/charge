package com.bupt.charger.dto.response;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AllBillsByDayResponse extends Resp {
    List<DateBillResponse> bills = new ArrayList<>();
}
