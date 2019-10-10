package com.sts.code;

import java.awt.image.BufferedImage;

/**
 * @author ：gb
 * @date ：Created in 2019/9/30 14:18
 */
public class ImageCode {

    public BufferedImage image;
    public String code;

    public ImageCode(BufferedImage image, String code) {
        this.image = image;
        this.code = code;
        System.out.println(111);
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
