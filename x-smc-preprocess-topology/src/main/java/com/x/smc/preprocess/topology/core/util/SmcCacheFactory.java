package com.x.smc.preprocess.topology.core.util;
//package com.ifudata.ic.smc.calculate.topology.core.util;
//
//import com.ai.opt.sdk.components.mcs.MCSClientFactory;
//import com.ai.paas.ipaas.mcs.interfaces.ICacheClient;
//
//public class SmcCacheFactory {
//    private static ICacheClient sysParamCacheClient;
//
//    public static ICacheClient getSysParamCacheClient() {
//        if (sysParamCacheClient == null) {
//            synchronized (SmcCacheFactory.class) {
//                if (sysParamCacheClient == null) {
//                    sysParamCacheClient = MCSClientFactory
//                            .getCacheClient(SmcCacheConstant.NameSpace.SYS_PARAM_CACHE);
//                }
//            }
//        }
//
//        return sysParamCacheClient;
//    }
//}
