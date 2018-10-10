/**
 * Project Name:fire-industry-map
 * File Name:DateUtil.java
 * Package Name:com.firestone.config.utils.common
 * Date:2018年7月20日下午2:18:00
 *
*/

package com.firestone.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description: 时间相关工具类
 * @author lvxc
 * @date 2018年7月20日 下午2:18:00
 */
public class DateUtil {
    public final static String yyyyMMdd = "yyyy-MM-dd";

    public final static String yyyyMM = "yyyy-MM";

    public final static String yyyy = "yyyy";
    
    /**
     * 
     * @Description: 获取最近几年年份
     * @param years
     * @return   
     * @author lvxc
     */
    public static List<Integer> getLastYears(int years) {
        if (years < 0) {
            return null;
        }
        List<Integer> lastYears = new ArrayList<Integer>();
        Calendar calendar = Calendar.getInstance();
        for (int i = 0; i < years; i++) {
            Integer year = (calendar.get(Calendar.YEAR) - i);
            lastYears.add(year);
        }
        Collections.reverse(lastYears);
        return lastYears;
    }
    
    /**
     * 
     * @Description: 获取某一年的开始年月日
     * @param year
     * @return   
     * @author Administrator
     */
    public static String getStartDayInYear(String year) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, Integer.parseInt(year));
        Date firstDay = calendar.getTime();
        return new SimpleDateFormat(yyyyMMdd).format(firstDay);
    }
    
    /**
     * 
     * @Description: 获取某一年的结束年月日
     * @param year
     * @return   
     * @author lvxc
     */
    public static String getEndDayInYear(String year) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, Integer.parseInt(year));
        calendar.roll(Calendar.DAY_OF_YEAR, -1);
        Date firstDay = calendar.getTime();
        return new SimpleDateFormat(yyyyMMdd).format(firstDay);
    }

    /**
     *
     * @Description: 获取前几年||前几月||前几日日期
     * @param calenderType 维度类型(Calendar.YEAR,Calendar.MONTH,Calendar.DAY_OF_YEAR)
     * @param preAxisLength 当前时间前区间长度
     * @param afterAxisLength 当前时间后区间长度
     * @param dateFormat 格式化
     * @return
     * @author hel
     */
    public static List<String> generationTimeAxis(Integer calenderType, Integer preAxisLength,
                                                  Integer afterAxisLength, String dateFormat){
        List<String> timeAxis = new ArrayList<>();
        if (calenderType == null || preAxisLength == null || dateFormat == null){
            return timeAxis;
        }
        try {
            Calendar calendar = Calendar.getInstance();
            if (afterAxisLength != null && afterAxisLength > 0){
                calendar.set(calenderType,calendar.get(calenderType) + afterAxisLength);
                preAxisLength += afterAxisLength;
            }
            int target = calendar.get(calenderType);
            SimpleDateFormat format = new SimpleDateFormat(dateFormat);
            for (int index = 0; index < preAxisLength; index ++){
                Calendar calendar1 = (Calendar) calendar.clone();
                calendar1.set(calenderType,target--);
                timeAxis.add(format.format(calendar1.getTime()));
            }
        }catch (Exception e){
            throw new RuntimeException("生成时间轴异常");
        }
        return timeAxis.stream().sorted().collect(Collectors.toList());
    }

    public static Date parseTime(String time, String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getNextTime(String time, String format){
        Integer calendarType = Calendar.MONTH;
        if (DateUtil.yyyyMM.equals(format)){
            calendarType = Calendar.MONTH;
        }
        if (DateUtil.yyyy.equals(format)){
            calendarType = Calendar.YEAR;
        }
        if (DateUtil.yyyyMMdd.equals(format)){
            calendarType = Calendar.DAY_OF_YEAR;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            Date date = sdf.parse(time);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.set(calendarType,calendar.get(calendarType) + 1);
            return sdf.format(calendar.getTime());

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";

    }

    public static String getTime(Date time, String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(time);
    }
    
    public static void main(String[] args) {
        System.out.println(getEndDayInYear("2016"));
    }
}

