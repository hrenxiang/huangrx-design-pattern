package cn.huangrx.构建型模式.原型模式.shaps;

import java.awt.*;
import java.util.Objects;

/**
 * 矩形
 *
 * @author    hrenxiang
 * @since     2022/5/16 1:50 PM
 */
public class Rectangle extends BaseShape {
    public int width;
    public int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public BaseShape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle) || !super.equals(object2)) {
            return false;
        }
        Rectangle shape2 = (Rectangle) object2;
        return shape2.width == width && shape2.height == height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}