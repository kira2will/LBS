package com.fiberhome.lbs.com.fiberhome.lbs;

import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Map<String,Double> map=LngAndLatUtil.getLngAndLat("上海市黄浦区六合路");
    	System.out.println("经度："+map.get("lng")+"---纬度："+map.get("lat"));
    }
}
