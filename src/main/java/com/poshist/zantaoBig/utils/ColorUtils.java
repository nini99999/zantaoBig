package com.poshist.zantaoBig.utils;

/**
 * Created by server on 17-5-12.
 */
public  class ColorUtils {
    private static String[] progressColors={"progress-bar-aqua","progress-bar-red","progress-bar-green","progress-bar-yellow"};

    /**
     * 取进度条颜色
     * @param i
     * @return
     */
    public static String getprogressColor(Long i){
        Long count =i%(progressColors.length);
        return progressColors[Integer.parseInt(count.toString())];
    }
}
