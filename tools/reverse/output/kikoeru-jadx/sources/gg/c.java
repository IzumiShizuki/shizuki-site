package gg;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f7545a = new ConcurrentHashMap();

    public static hg.a a() {
        hg.a aVar = (hg.a) f7545a.get("DEFAULT");
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Okkv[DEFAULT] is null");
    }
}
