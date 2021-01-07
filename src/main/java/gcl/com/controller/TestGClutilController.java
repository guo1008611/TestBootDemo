package gcl.com.controller;


import gcl.com.comment.QuickSort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/gcl")
public class TestGClutilController {


    @RequestMapping("list")
    public  String gethello(){
        return "hello world! ";
    }


     /**
       *
       * @author: gcl
       * @date: 2020/12/31 11:51
       * @param:
       * @return:
       * @description:  快速排序
       */

    @RequestMapping("kspx")
    public  String kspx(){
        int[] list = new int[10000];
        for (int i = 0; i < 10000; i++) {
            list[i] = (int) (Math.random() * 100000);
        }
        long start = System.currentTimeMillis();
        QuickSort.quickSort(list, 0, list.length - 1);
        long end = System.currentTimeMillis();
        System.out.println("快速排序耗费的时间：" + (end - start));
        display(list);
        return "hello world! ";
    }

    /**
     * 遍历打印前10个数
     */
    public static void display(int[] list) {
        System.out.println("********排序之后的前10个数start********");
        if (list != null && list.length > 0) {
            for (int i = 0; i < 10; i++) {
                System.out.print(list[i] + " ");
            }
            System.out.println("");
        }
        System.out.println("********排序之后的前10个数end**********");
        System.out.println("");
    }
}
