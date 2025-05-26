package com.bupt.charger.service;

import com.bupt.charger.entity.Car;
import com.bupt.charger.entity.ChargeRequest;
import com.bupt.charger.entity.Pile;

import java.util.List;

public interface ScheduleService {
    // 添加到等候区队列，返回分配的号码
    String moveToWaitingQueue(Car car);

    // 获得有空余的充电队列
    List<Pile> getChargingNotFullQueue(Pile.Mode mode);

    // 提醒车辆开始充电函数
    boolean remindCarStartCharge(String pileId);

    // 进入充电区f
    void moveToChargingQueue();

    // 将指定车辆从等候区移除
    void removeFromWaitingQueue(String carId, ChargeRequest.RequestMode oldMode);

    // 基本调度策略
    String basicSchedule(List<Pile> piles, Pile.Mode mode);

    // 这个是故障机制中，故障充电桩车辆停止充电
    void errorStopCharging(String carId);

    /*  获取故障上报请求,也可管理员端直接进行,暂停正在充电的车辆,同时转移队列到故障队列
            注意一个问题: 优先级调度就是将对应的原充电桩队列转移到相应模式的故障队列,但是时间顺序队列需要将同类型的所有没在充电的车辆全部汇集到故障队列里面,同时需要按照车辆排队号码进行排序,数字越大越靠后.汇聚之后将原来的队列清空,因为我们有实时检测是否有队列空的,自然就会从故障队列里面加回去
         */
//    故障-优先级调度移动队列
    void priorityErrorMoveQueue(String pileId);

    //    故障-时间顺序调度移动队列
    void timeErrorMoveQueue(String pileId);
}
