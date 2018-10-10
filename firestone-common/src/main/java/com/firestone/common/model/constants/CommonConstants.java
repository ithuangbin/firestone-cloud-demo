package com.firestone.common.model.constants;


import java.util.*;

/**
 * @Description: TODO(公共常量类)
 * @param
 * @return
 * @author hel
 * @date 2018/7/25/023 15:20
 */
public class CommonConstants {

    //当前日期后一（年|月|日）区间长度
    public static final Integer AFTER_AXIS_LENGTH_ONE = 1;

    //当前日期前四（年|月|日）区间长度
    public static final Integer PRE_AXIS_LENGTH_FOUR = 4;

    //当前日期前五（年|月|日）区间长度
    public static final Integer PRE_AXIS_LENGTH_FIVE = 5;

    //当前日期前六（年|月|日）区间长度
    public static final Integer PRE_AXIS_LENGTH_SIX = 6;

    //长度0
    public static final Integer LEN_ZERO = 0;

    //长度1
    public static final Integer LEN_ONE = 1;

    //长度2
    public static final Integer LEN_TWO = 2;

    //大小100
    public static final Integer SIZE_100 = 100;

    //聚合的别名buckets
    public static final String ALIAS_BUCKETS = "buckets";

    public static final LinkedHashMap<Integer, String> DRUG_APPLY_TYPE_NEW = new LinkedHashMap<Integer, String>() {

        private static final long serialVersionUID = 1L;

        {
            put(1, "申请临床");
            put(2, "临床试验");
            put(3, "上市申请");
            put(4, "获批上市");
        }
    };

    public static final Map<String, String> STANDARD_TYPE = new HashMap<String, String>() {

        private static final long serialVersionUID = 1L;
        {
            put("1", "国家标准");
            put("2", "行业标准");
            put("3", "地方标准");
            put("4", "企业标准");
        }
    };


    public static final Map<String, List<String>> TIANFU_ZHIZI_DIC = new HashMap<String, List<String>>() {

        private static final long serialVersionUID = 1L;
        {
            put("3772", new ArrayList<String>(){
                private static final long serialVersionUID = 1L;
                {
                    add("国家高企");
                    add("省高新技术企业");
                    add("省科技中小企业");
                    add("区生物医药重点企业");
                }
            });
        }
    };


//    public static final Map<String, String> HUAXIA_POLICY_DIC = new HashMap<String, String>() {
//        private static final long serialVersionUID = 1L;
//
//        {
//            put("must", "医、药、病、症、伤、齿、诊、癌、眼科、康复、保健、" +
//                    "卫生、肿瘤、免疫、基因、生物、临床、康护、生命科学、化疗、" +
//                    "疗养、化验、人寿、养老、治疗、口腔、体检、针灸、护理、骨骼、" +
//                    "生化、整容、整形、试剂、制剂、中间体、提取物、蛋白质、角膜、疫苗、门诊、诊所");
//            put("or","健康、抗");
//            put("mustNot","牧、兽、动物、宠物、齿轮、饲料、戒毒、农药、化肥、建材、建筑、抗战、足疗、皮具、皮革、汽车护理、汽车美容、美发、理发、造型");
//        }
//    };

    public static final Map<String, List<String>> HUAXIA_POLICY_REG = new HashMap<String, List<String>>() {
        private static final long serialVersionUID = 1L;

        {
            //全部
            put("0", new ArrayList<String>(){
                private static final long serialVersionUID = 1L;
                {
                    add(".{8}01.*");
                    add(".{8}02.*");
                    add(".{8}08.*");
                    add(".{8}11.*");
                }
            });
        }
    };

    public static final Map<String, List<String>> TIANFU_POLICY_REG = new HashMap<String, List<String>>() {

        private static final long serialVersionUID = 1L;

        {
            //全部
            put("0", new ArrayList<String>(){
                private static final long serialVersionUID = 1L;
                {
                    add("8600000001.{3}");
                    add("8600000002.{3}");
                    add("8600000008.{3}");
                    add("8600000011.{3}");
                    add("8651010020.{3}");
                    add("8651000001.{3}");
                    add("8651000002.{3}");
                    add("8651000008.{3}");
                    add("8651000011.{3}");
                    add("8651010001.{3}");
                    add("8651010002.{3}");
                    add("8651010008.{3}");
                    add("8651010011.{3}");
                    add("8651010020.{3}");
                }
            });
            //国家级
            put("1", new ArrayList<String>(){
                private static final long serialVersionUID = 1L;
                {
                    add("8600000001.{3}");
                    add("8600000002.{3}");
                    add("8600000008.{3}");
                    add("8600000011.{3}");
                }
            });
            //省级
            put("2", new ArrayList<String>(){
                private static final long serialVersionUID = 1L;
                {
                    add("8651000001.{3}");
                    add("8651000002.{3}");
                    add("8651000008.{3}");
                    add("8651000011.{3}");
                }
            });
            //市级
            put("3", new ArrayList<String>(){
                private static final long serialVersionUID = 1L;
                {
                    add("8651010001.{3}");
                    add("8651010002.{3}");
                    add("8651010008.{3}");
                    add("8651010011.{3}");
                    add("8651010020.{3}");
                }
            });
            //区级
            put("4", new ArrayList<String>(){
                private static final long serialVersionUID = 1L;
                {
                    add("8651010020.{3}");
                }
            });
        }
    };
}
