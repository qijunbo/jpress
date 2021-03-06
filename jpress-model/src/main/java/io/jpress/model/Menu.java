package io.jpress.model;

import io.jboot.db.annotation.Table;
import io.jpress.model.base.BaseMenu;

/**
 * Generated by Jboot.
 */
@Table(tableName = "menu", primaryKey = "id")
public class Menu extends BaseMenu<Menu> {


    /**
     * type 主要是用来对菜单组的定义，菜单组是：pid = 0;
     * admin_system:系统菜单组；
     * admin_module:用户自己创建的后台菜单组；
     * admin_annotation:后台声明的子菜单；
     * <p>
     * front_header：前台顶部菜单；
     * front_main:前台主菜单；
     * front_footer:前台底部菜单；
     */
    public static final String TYPE_ADMIN_SYSTEM = "admin_system"; //后台的内容菜单，理论上module都是内容
    public static final String TYPE_ADMIN_MODULE = "admin_module"; //后台的系统菜单，一般放在内容菜单的下方
    public static final String TYPE_ADMIN_ANNOTATION = "admin_annotation"; //后台的系统菜单，一般放在内容菜单的下方

    public static final String TYPE_FRONT_HEADER = "front_header"; //前台的头部菜单
    public static final String TYPE_FRONT_MAIN = "front_main"; //前台的主菜单，一般用在左边导航或者右边导航，根据模板本身来决定的
    public static final String TYPE_FRONT_FOOTER = "front_footer"; //前台的底部菜单

    /**
     * flag 主要对系统菜单组的唯一标识
     * 系统菜单是 JPress 安装的时候就创建的
     */
    public static final String FLAG_USER = "user";
    public static final String FLAG_ATTACHMENT = "attachment";
    public static final String FLAG_TOOL = "tool";
    public static final String FLAG_SETTING = "setting";
    public static final String FLAG_TEMPLATE = "template";
    public static final String FLAG_STATISTICS = "statistics";
    public static final String FLAG_ORDER = "order";
    public static final String FLAG_PERMISSION = "permission";


}
