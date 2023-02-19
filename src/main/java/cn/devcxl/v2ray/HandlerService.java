package cn.devcxl.v2ray;

import cn.devcxl.v2ray.bean.Inbound;
import cn.devcxl.v2ray.bean.Outbound;

/**
 * @author devcxl
 */
public interface HandlerService {
    /**
     * addInbound
     *
     * @param inbound
     */
    public void addInbound(Inbound inbound);

    /**
     * removeInbound
     *
     * @param inbound
     */
    public void removeInbound(Inbound inbound);

    /**
     * alterInbound
     *
     * @param inbound
     */
    public void alterInbound(Inbound inbound);

    /**
     * addOutbound
     *
     * @param outbound
     */
    public void addOutbound(Outbound outbound);

    /**
     * removeOutbound
     *
     * @param outbound
     */
    public void removeOutbound(Outbound outbound);

    /**
     * alterOutbound
     *
     * @param outbound
     */
    public void alterOutbound(Outbound outbound);


}
