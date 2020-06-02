package builder2;

/**
 * 账单列表接口
 */
public interface Bill {

     /**
      * 系统
      * @return
      */
     BillSystem billSystemName();

     /**
      * 时间
      * @return
      */
     String time();

     /**
      * 金额
      * @return
      */
     float money();
}
