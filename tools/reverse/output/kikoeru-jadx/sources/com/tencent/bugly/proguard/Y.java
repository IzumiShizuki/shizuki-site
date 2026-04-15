package com.tencent.bugly.proguard;

import android.text.TextUtils;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Proxy f4919a;

    public static void a(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            f4919a = null;
        } else {
            f4919a = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(str, i10));
        }
    }

    public static void a(InetAddress inetAddress, int i10) {
        if (inetAddress == null) {
            f4919a = null;
        } else {
            f4919a = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(inetAddress, i10));
        }
    }

    public static Proxy a() {
        return f4919a;
    }
}
